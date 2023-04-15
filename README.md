# JHolodex 
![GitHub release (latest by date)](https://img.shields.io/github/v/release/pinapelz/JHolodex)
[![](https://jitpack.io/v/pinapelz/JHolodex.svg)](https://jitpack.io/#pinapelz/JHolodex)
[![build](https://github.com/pinapelz/JHolodex/actions/workflows/maven.yml/badge.svg)](https://github.com/pinapelz/JHolodex/actions/workflows/maven.yml)

A mega scuffed Java Holodex Wrapper (Currently a work in progress). Supports the GET Requests from [Holodex API](https://holodex.stoplight.io/). Objects are used to build queries if more than one path or parameter is used for the given request.

## Usage
Please check what values are available from your response through Holodex's API documentation. Null values indicate that the endpoint you are on does not serve the value you are trying to retrieve.
```java
Holodex holodex = new Holodex("YOUR_API_KEY");
Channel channel = holodex.getChannel("UC4WvIIAo89_AzGUh1AZ6Dkg");
System.out.println(channel.name + " is a member of " + channel.org + " and has " + channel.suborg + " as a suborg");

VideoQueryBuilder liveVideoQuery = new VideoQueryBuilder().setStatus("live").setOrg("Hololive");
List<SimpleVideo> currentlyLiveVideos = holodex.getLiveAndUpcomingVideos(liveVideoQuery);
System.out.println("Currently there are " + currentlyLiveVideos.size() + " livestreams on going in Hololive");

for (SimpleVideo video : currentlyLiveVideos) {
System.out.println(video.channel.name + " is currently live with " + video.live_viewers + " views");
}

ChannelQueryBuilder channelQuery = new ChannelQueryBuilder();
channelQuery.setOrg("Nijisanji");
channelQuery.setLimit(75);
List<Channel> nijisanjiMembers = holodex.getChannels(channelQuery);

Video anotherVideo = holodex.getVideo(new VideoByVideoIdQueryBuilder().setVideoId("9-O_IWM3184").setLang("en"));
System.out.println(anotherVideo.channel.name + " uploaded a video titled " + anotherVideo.title +
" on " + anotherVideo.published_at);

// SEARCHING THROUGH VIDEOS AND COMMENTS
Object srv = holodex.searchVideo(new VideoSearchQueryBuilder().setOrg(List.of("Nijisanji")).setSort("newest").
setTarget(List.of("stream")).setPaginated(false).setLimit(10).setOffset(0)
.setTopic(List.of("singing"))
);
System.out.println("--- Search Results ---");
for (SimpleVideo video : (List<SimpleVideo>) srv) {
System.out.println(video.title + " - " + video.channel.name);
}


System.out.println("\n\n\nNow Searching Comments");
String word = "Mumei";
Object scr = holodex.searchComment(new CommentSearchQueryBuilder().setOrg(List.of("Hololive")).setComment(List.of(word)).setLimit(1).setPaginated(false));
System.out.println("--- Search Results for comments containing kw: "+word+" ---");
for (SimpleCommentVideo video : (List<SimpleCommentVideo>) scr) {
System.out.println(video.title + " - " + video.channel.name);
for (Comment comment : video.comments) {
System.out.println("    "+comment.message);
}
```

## Download
![GitHub release (latest by date)](https://img.shields.io/github/v/release/pinapelz/JHolodex)
[![](https://jitpack.io/v/pinapelz/JHolodex.svg)](https://jitpack.io/#pinapelz/JHolodex)
### Maven
```xml
<dependency>
    <groupId>com.github.pinapelz</groupId>
    <artifactId>JHolodex</artifactId>
    <version>VERSION_HERE</version>
</dependency>
```

### Gradle
```gradle
dependencies {
        implementation 'com.github.pinapelz:JHolodex:Tag'
}
```
#### Add [JitPack](https://jitpack.io/) to your list of repositories
#### [Holodex License](https://docs.holodex.net/docs/holodex/8166fcec5dbe2-license)
