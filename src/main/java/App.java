import com.pina.Holodex;
import com.pina.HolodexException;
import com.pina.datatypes.SimpleVideo;
import com.pina.query.VideoSearchQueryBuilder;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        try {
            Holodex holodex = new Holodex("e6bf4c1a-b58c-4b25-bb13-47cdc1146321");
            Object srv = holodex.searchVideo(new VideoSearchQueryBuilder().setOrg(List.of("Nijisanji")).setSort("newest").
                    setTarget(List.of("stream")).setPaginated(false).setLimit(10).setOffset(0)
                    .setTopic(List.of("singing"))
            );
            System.out.println("--- Search Results ---");
            for (SimpleVideo video : (List<SimpleVideo>) srv) {
                System.out.println(video.title + " - " + video.channel.name);
            }

            } catch (HolodexException ex) {
            throw new RuntimeException(ex);
        }

    }

}
