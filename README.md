# JHolodex 
[![](https://jitpack.io/v/pinapelz/JHolodex.svg)](https://jitpack.io/#pinapelz/JHolodex)
[![build](https://github.com/pinapelz/JHolodex/actions/workflows/maven.yml/badge.svg)](https://github.com/pinapelz/JHolodex/actions/workflows/maven.yml)


A mega scuffed Java Holodex Wrapper (Currently a work in progress). Supports the GET Requests from [Holodex API](https://holodex.stoplight.io/). Objects are used to build queries if more than one path or parameter is used for the given request.

## Usage
```java
Holodex holodex = new Holodex("YOUR_API_KEY");
Channel channel = holodex.getChannel("UC4WvIIAo89_AzGUh1AZ6Dkg");
System.out.println(channel.name + " is a member of " + channel.org + " and has " + channel.suborg + " as a suborg");

LiveVideoQueryBuilder liveVideoQuery = new LiveVideoQueryBuilder().setStatus("live").setOrg("Hololive");
List<Video> currentlyLiveVideos = holodex.getLiveVideos(liveVideoQuery);
System.out.println("Currently there are " + currentlyLiveVideos.size() + " livestreams on going in Hololive");

for (Video video : currentlyLiveVideos) {
    System.out.println(video.channel.name + " is currently live with " + video.live_viewers + " views");
}

ChannelQueryBuilder channelQuery = new ChannelQueryBuilder();
channelQuery.setOrg("Nijisanji");
channelQuery.setLimit(75);
List<Channel> nijisanjiMembers = holodex.getChannels(channelQuery);

VideoQueryBuilder vidoeQuery = new VideoQueryBuilder();
vidoeQuery.setVideoId("9-O_IWM3184");
Video anotherVideo = holodex.getVideo(new VideoQueryBuilder().setVideoId("9-O_IWM3184").setLang("en"));
System.out.println(anotherVideo.channel.name + " uploaded a video titled " + anotherVideo.title +
  " on " + anotherVideo.published_at);
```

## Download
Maven
```xml
<dependency>
    <groupId>com.github.pinapelz</groupId>
    <artifactId>JHolodex</artifactId>
    <version>VERSION_HERE</version>
</dependency>
```

[Holodex License](https://docs.holodex.net/docs/holodex/8166fcec5dbe2-license)
