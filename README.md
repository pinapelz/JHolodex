# JHolodex
[![build](https://github.com/pinapelz/JHolodex/actions/workflows/maven.yml/badge.svg)](https://github.com/pinapelz/JHolodex/actions/workflows/maven.yml)

A Java wrapper for the [Holodex API](https://docs.holodex.net/#section/Holodex-API-Documentation).

All GET and POST requests are supported and is modelled after the Holodex API.
Please check the [Holodex API](https://holodex.stoplight.io/) for more information regarding the specifications


[Holodex License](https://docs.holodex.net/#section/LICENSE)

## Download
![](https://img.shields.io/github/v/release/pinapelz/JHolodex)
[![](https://jitpack.io/v/pinapelz/JHolodex.svg)](https://jitpack.io/#pinapelz/JHolodex)
### Maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.pinapelz</groupId>
    <artifactId>JHolodex</artifactId>
    <version>VERSION_HERE</version>
</dependency>
```

### Gradle
```java
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
        implementation 'com.github.pinapelz:JHolodex:Tag'
}
```
#### Add [JitPack](https://jitpack.io/) to your list of repositories



## Getting Started
Please check what values are available at each endpoint through the [Holodex API Documentation](https://docs.holodex.net/#section/Holodex-API-Documentation).

The use of enums is optional, you can always pass in Strings as parameters as they appear on Holodex

The following are some example use cases to get you started.
### Channel Information
```java
Holodex holodex = new Holodex("YOUR_API_KEY_HERE");
Channel channel = holodex.getChannel("UCupmjRr7kPgzXKh-cPxxGbg");
System.out.println(channel.name); // Erina Ch. エリナ・マキナ 【Phase Connect】
System.out.println(channel.english_name); // Erina Makina    # This provides an English or localized name if available
System.out.println(channel.type); // vtuber
System.out.println(channel.subscriber_count); // 28500
```

### Live and Upcoming Videos
Queries the videos for a particular channel
```java
List<Video> videos = holodex.getVideos(new VideoQueryBuilder().setChannelId("UCupmjRr7kPgzXKh-cPxxGbg")
.setStatus(Status.PAST).setLimit(5));
for (Video video : videos) {
    System.out.println(video.title + " - Currently: " + video.status);
    System.out.println(video.start_scheduled);
    System.out.println(video.id);
}
```
Functions similarly to the above but contains the following [default parameters](https://docs.holodex.net/#/paths/~1live/get)
```java
List<SimpleVideo> videos = holodex.getLiveAndUpcomingVideos(new VideoQueryBuilder().setChannelId("UCupmjRr7kPgzXKh-cPxxGbg"));
for (SimpleVideo video : videos) {
    System.out.println(video.title + " - Currently: " + video.status);
}
```

### Video Information
```java
Video video = holodex.getVideo(new VideoByVideoIdQueryBuilder().setVideoId("CN4_2sEx6vA"));
System.out.println(video.title); // HAPPY ONE YEAR OF ERINA!!! 🐯
System.out.println(video.status); // past
System.out.println(video.published_at); // 2023-07-12T08:46:57.000Z
```

### List Channels
```java
List<Channel> phaseConnectChannels = holodex.getChannels(new ChannelQueryBuilder().setOrg(Organization.PHASE_CONNECT).setLimit(50));
System.out.println(phaseConnectChannels.size()); // 26
for (Channel channel : phaseConnectChannels) {
    System.out.println(channel.name);
}
```

### Searching for Videos
```java
Object srv = holodex.searchVideo(new VideoSearchQueryBuilder().setSort("newest").setTopic(List.of("Music_Cover")).
        setPaginated(true).setLimit(50));
System.out.println(srv.getClass());
List videos = ((VideoSearchResult) srv).items;
System.out.println(videos.size());
for (Object video : videos) {
    SimpleVideo vid = (SimpleVideo) video;
    System.out.println(vid.title + vid.status);
    System.out.println(vid.id);
}
```

### Searching Comments
```java
Object scr = holodex.searchComment(new CommentSearchQueryBuilder().setOrg(Organization.NIJISANJI).
        setComment(List.of("cover", "cool")).setLimit(5).setPaginated(false));
for (SimpleCommentVideo video : (List<SimpleCommentVideo>) scr) {
    System.out.println(video.title + " - " + video.channel.name);
    for (Comment comment : video.comments) {
        System.out.println("    " + comment.message);
    }
}
```

