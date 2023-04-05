import com.pina.Holodex;
import com.pina.HolodexException;
import com.pina.datatypes.Video;
import com.pina.query.LiveStreamsQueryBuilder;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        Holodex holodex = new Holodex();
        try {
            LiveStreamsQueryBuilder query = new LiveStreamsQueryBuilder();
            query.setStatus("live");
            query.setOrg("WACTOR");
            List<Video> videos = holodex.getLiveStreams(query);
            for (Video stream : videos) {
                System.out.println(stream.title + " is live with " + stream.live_viewers + " viewers " + stream.id);
            }
        } catch (HolodexException e) {
            System.err.println("Failed to get live streams: " + e.getMessage());
        }
    }
}
