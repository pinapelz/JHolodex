import com.pina.Holodex;
import com.pina.HolodexException;
import com.pina.datatypes.Livestream;
import com.pina.query.LiveStreamsQueryBuilder;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        Holodex holodex = new Holodex();
        try {
            LiveStreamsQueryBuilder query = new LiveStreamsQueryBuilder();
            query.setChannelId("UCBQd84IW8OvM8H5jftHdvmw");
            query.setStatus("live");
            List<Livestream> livestreams = holodex.getLiveStreams(query);
            for (Livestream stream : livestreams) {
                System.out.println(stream.title + " is live with " + stream.live_viewers + " viewers" + stream.id);
            }
        } catch (HolodexException e) {
            System.err.println("Failed to get live streams: " + e.getMessage());
        }
    }
}
