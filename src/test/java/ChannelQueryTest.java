import com.pinapelz.datatypes.Channel;
import org.junit.Test;
import com.pinapelz.query.ChannelQueryBuilder;
import com.pinapelz.Holodex;
import com.pinapelz.HolodexException;

import java.util.List;

import static org.junit.Assert.fail;

public class ChannelQueryTest {
    private final String apiKey = System.getenv("HOLODEX_API_KEY");
    @Test
    public void testChanneQueryIntiailization(){
        ChannelQueryBuilder channelQueryBuilder = new ChannelQueryBuilder().setLang("en").setOrg("hololive");
        assert(channelQueryBuilder.getLang().equals("en"));
        assert(channelQueryBuilder.getOrg().equals("hololive"));
    }

    @Test
    public void testChannelQuerySetters(){
        ChannelQueryBuilder channelQueryBuilder = new ChannelQueryBuilder();
        channelQueryBuilder.setLang("en");
        channelQueryBuilder.setOrg("hololive");
        channelQueryBuilder.setOrder("asc");
        assert(channelQueryBuilder.getLang().equals("en"));
        assert(channelQueryBuilder.getOrg().equals("hololive"));
        assert(channelQueryBuilder.getOrder().equals("asc"));
    }


}
