import com.pina.Holodex;
import com.pina.HolodexException;
import com.pina.datatypes.Channel;
import com.pina.datatypes.Video;
import com.pina.query.ChannelQueryBuilder;
import com.pina.query.LiveVideoQueryBuilder;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        Holodex holodex = new Holodex();
        try {
            ChannelQueryBuilder query = new ChannelQueryBuilder();
            query.setOrg("Hololive");
            List<Channel> channels = holodex.getChannels(query);
            System.out.println("The Members of Hololive are:");
            for (Channel channel : channels) {
                System.out.println(channel.name + " (" + channel.id + ")");
            }
            System.out.println("\n");
            Channel channel = holodex.getChannel("UC1DCedRgGHBdm81E1llLhOQ");
            System.out.println(channel.name+"'s English name is " + channel.english_name);
            System.out.println(channel.name+" is a "+channel.type);

            LiveVideoQueryBuilder liveQuery = new LiveVideoQueryBuilder();
            liveQuery.setChannelId("UCkngxfPbmGyGl_RIq4FA3MQ");
            liveQuery.setStatus("upcoming");
            List<Video> chigusaUpcoming = holodex.getVideos(liveQuery);
            System.out.println("\n");
            System.out.println("Chigusa's upcoming streams are:");
            for (Video video : chigusaUpcoming) {
                System.out.println(video.title + " (" + video.id + ")");
            }



        } catch (HolodexException e) {
            System.err.println("Failed to get live streams: " + e.getMessage());
        }
        System.exit(0);
    }
}
