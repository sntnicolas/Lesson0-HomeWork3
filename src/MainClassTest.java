import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetClassString(){
        MainClass testMainClass = new MainClass();
        String str1 = testMainClass.getClassString();
        int index1 = str1.indexOf("Hello");
        int index2 = str1.indexOf("hello");

        Assert.assertTrue(
                "Текст должен содержать \"Hello\" или \"hello\"",
                index1 != -1 || index2 != -1);
        }
}