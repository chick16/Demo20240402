import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.ConsecutiveCharRemoverService;
import service.impl.ConsecutiveCharRemoverServiceImpl;

public class ConsecutiveCharRemoverTest {

    @Test
    public void testRemoveConsecutiveCharacters() {
        ConsecutiveCharRemoverService con=new ConsecutiveCharRemoverServiceImpl();

        Assertions.assertEquals("abbbad", con.replaceConsecutiveChars("abcccbad"));

        Assertions.assertEquals("d", con.replaceConsecutiveChars("aaad"));


    }

}
