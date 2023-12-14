import com.pinapelz.datatypes.*;
import com.pinapelz.vtuber.Organization;
import org.junit.Test;

public class DataTypeTests {
    @Test
    public void testChannelComparison(){
        Channel channel = new Channel();
        channel.name = "test";
        assert(channel.name.equals("test"));
        Channel channel2 = new Channel();
        channel2.name = "test";
        assert(channel.equals(channel2));
        Channel channel3 = new Channel();
        channel3.name = "test2";
        assert(!channel.equals(channel3));
    }

    @Test
    public void testCommentComparison(){
        Comment comment = new Comment();
        comment.comment_key = "test";
        assert(comment.comment_key.equals("test"));
        Comment comment2 = new Comment();
        comment2.comment_key = "test";
        assert(comment.equals(comment2));
        Comment comment3 = new Comment();
        comment3.comment_key = "test2";
        assert(!comment.equals(comment3));
    }

    @Test
    public void testVideoComparison(){
        Video video = new Video();
        video.title = "test";
        assert(video.title.equals("test"));
        Video video2 = new Video();
        video2.title = "test";
        assert(video.equals(video2));
        Video video3 = new Video();
        video3.title = "test2";
        assert(!video.equals(video3));
    }

    @Test
    public void testVideoSearchResultComparison(){
        VideoSearchResult videoSearchResult = new VideoSearchResult();
        videoSearchResult.total = 1;
        assert(videoSearchResult.total == 1);
        VideoSearchResult videoSearchResult2 = new VideoSearchResult();
        videoSearchResult2.total = 1;
        assert(videoSearchResult.equals(videoSearchResult2));
        VideoSearchResult videoSearchResult3 = new VideoSearchResult();
        videoSearchResult3.total = 2;
        assert(!videoSearchResult.equals(videoSearchResult3));
    }

    @Test
    public void testComparisonOrganiationEnum(){
        assert Organization.HOLOLIVE.isOrg("Hololive");
    }

}
