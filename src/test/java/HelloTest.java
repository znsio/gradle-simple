import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class HelloTest {

    @Test
    public void test1() {
        for(int i = 1; i <= 5; i++)
            System.out.println("Running test1 - " + i);
        assertEquals(1, 1);
    }

    @Test
    public void test2() {
        for(int i = 1; i <= 5; i++)
            System.out.println("Running test2 - " + i);
        assertEquals(1, 1);
    }
}
