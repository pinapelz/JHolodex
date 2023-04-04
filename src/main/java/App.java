import com.pina.Holodex;
import com.pina.HolodexException;
import com.pina.LiveStream;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        Holodex holodex = new Holodex();
        try {
            List<LiveStream> liveStreams = holodex.getLiveStreams();
            for (LiveStream stream : liveStreams) {
                System.out.println(stream.title + " by " + stream.channel.name);
            }
        } catch (HolodexException e) {
            System.err.println("Failed to get live streams: " + e.getMessage());
        }
    }
}
