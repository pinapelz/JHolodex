import com.pina.Holodex;
import com.pina.HolodexException;
import com.pina.datatypes.Channel;
import com.pina.datatypes.Video;
import com.pina.query.ChannelQueryBuilder;
import com.pina.query.VideoQueryBuilder;
import com.pina.query.VideoMetadataQueryBuilder;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        try {
            Holodex holodex = new Holodex("b33eda39-dfb0-4337-9c8a-49cd8e69f5d5");
            Channel channel = holodex.getChannel("UC4WvIIAo89_AzGUh1AZ6Dkg");
            System.out.println(channel.name + " is a member of " + channel.org + " and has " + channel.suborg + " as a suborg");

            VideoQueryBuilder liveVideoQuery = new VideoQueryBuilder().setStatus("live").setOrg("Hololive");
            List<Video> currentlyLiveVideos = holodex.getLiveVideos(liveVideoQuery);
            System.out.println("Currently there are " + currentlyLiveVideos.size() + " livestreams on going in Hololive");
            for (Video video : currentlyLiveVideos) {
                System.out.println(video.channel.name + " is currently live with " + video.live_viewers + " views");
            }

            ChannelQueryBuilder channelQuery = new ChannelQueryBuilder();
            channelQuery.setOrg("Nijisanji");
            channelQuery.setLimit(75);
            List<Channel> nijisanjiMembers = holodex.getChannels(channelQuery);
            // Gets the first 75 members of Nijisanji

            VideoMetadataQueryBuilder vidoeQuery = new VideoMetadataQueryBuilder();
            vidoeQuery.setVideoId("9-O_IWM3184");
            Video anotherVideo = holodex.getVideo(new VideoMetadataQueryBuilder().setVideoId("9-O_IWM3184").setLang("en"));
            System.out.println(anotherVideo.channel.name + " uploaded a video titled " + anotherVideo.title + " on " + anotherVideo.published_at);

        }
        catch (HolodexException e) {
            e.printStackTrace();
        }
    }
}
