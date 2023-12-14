import com.pinapelz.datatypes.Channel;
import org.junit.Test;
import com.pinapelz.query.ChannelQueryBuilder;


public class ChannelQueryTest {
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
