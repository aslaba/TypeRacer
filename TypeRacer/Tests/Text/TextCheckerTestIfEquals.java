package Text;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TextCheckerTestIfEquals {
    @Test
    public void testTextChecker(){
        String str = "Hello";
        String str1 = str;
        TextChecker testChecker = new TextChecker();
        testChecker.setText(str);
        testChecker.check(str1);
        Assertions.assertTrue(testChecker.isGameFinished());
    }
}
