import com.pinapelz.Holodex;
import com.pinapelz.HolodexException;
import com.pinapelz.datatypes.*;
import com.pinapelz.vtuber.*;
import com.pinapelz.query.*;

import java.util.List;

public class App {
    public static void main(String[] args) {
        try {
            Holodex holodex = new Holodex("YOUR_API_KEY_HERE");
            Channel channel = holodex.getChannel("UC4WvIIAo89_AzGUh1AZ6Dkg");
            System.out.println(channel.name + " is a member of " + channel.org + " and has " + channel.suborg + " as a suborg");

            VideoQueryBuilder liveVideoQuery = new VideoQueryBuilder().setStatus(Status.LIVE).setOrg(Organization.HOLOLIVE);
            List<SimpleVideo> currentlyLiveVideos = holodex.getLiveAndUpcomingVideos(liveVideoQuery);
            System.out.println("Currently there are " + currentlyLiveVideos.size() + " livestreams on going in Hololive");

            for (SimpleVideo video : currentlyLiveVideos) {
                System.out.println(video.channel.name + " is currently live with " + video.live_viewers + " views");
            }

            ChannelQueryBuilder channelQuery = new ChannelQueryBuilder();
            channelQuery.setOrg(Organization.NIJISANJI);
            channelQuery.setLimit(75);

            List<Channel> nijisanjiMembers = holodex.getChannels(channelQuery);

            System.out.println("There are " + nijisanjiMembers.size() + " members in " + Organization.NIJISANJI);

            Video anotherVideo = holodex.getVideo(new VideoByVideoIdQueryBuilder().setVideoId("9-O_IWM3184").setLang(
                    List.of(Language.ENGLISH, Language.JAPANESE)));

            System.out.println(anotherVideo.channel.name + " uploaded a video titled " + anotherVideo.title +
                    " on " + anotherVideo.published_at);

            // SEARCHING THROUGH VIDEOS AND COMMENTS
            Object srv = holodex.searchVideo(new VideoSearchQueryBuilder().setOrg(Organization.NIJISANJI).setSort(Sort.NEWEST).
                    setTarget(Type.STREAM).setPaginated(false).setLimit(10).setOffset(0)
                    .setTopic(List.of("singing"))
            );
            System.out.println("--- Search Results ---");
            for (SimpleVideo video : (List<SimpleVideo>) srv) {
                System.out.println(video.title + " - " + video.channel.name);
            }

            System.out.println("\n\n\nNow Searching Comments");
            String word = "eating";
            Object scr = holodex.searchComment(new CommentSearchQueryBuilder().setOrg(Organization.NIJISANJI).setComment(List.of(word)).setLimit(1).setPaginated(false));
            System.out.println("--- Search Results for comments containing kw: " + word + " ---");
            for (SimpleCommentVideo video : (List<SimpleCommentVideo>) scr) {
                System.out.println(video.title + " - " + video.channel.name);
                for (Comment comment : video.comments) {
                    System.out.println("    " + comment.message);
                }
            }
        } catch (HolodexException ex) {
            throw new RuntimeException(ex);
        }


    }
}
