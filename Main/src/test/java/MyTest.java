import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {

    @Test
    public void addTest() {
        Assert.assertEquals(5+6, 11);
    }

    @Test
    public void disTest() {
        Assert.assertEquals(6-3, 3);
    }

    @Test
    public void mulTest() {
        Assert.assertEquals(6*3, 18);
    }
}
