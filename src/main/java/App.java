import com.pina.Holodex;
import com.pina.HolodexException;
import com.pina.datatypes.Channel;
import com.pina.datatypes.SimpleVideo;
import com.pina.datatypes.Video;
import com.pina.query.ChannelQueryBuilder;
import com.pina.query.VideoByVideoIdQueryBuilder;
import com.pina.query.VideoQueryBuilder;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        try {
            Holodex holodex = new Holodex("YOUR_API_KEY_HERE");
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
        } catch (HolodexException ex) {
            throw new RuntimeException(ex);
        }

    }

}
