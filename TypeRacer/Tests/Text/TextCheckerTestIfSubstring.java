package Text;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TextCheckerTestIfSubstring {
    @Test
    public void testTextChecker(){
        String str = "Hello";
        String str1 = str.substring(0, 2);
        TextChecker testChecker = new TextChecker();
        testChecker.setText(str);
        Assertions.assertTrue(testChecker.check(str1));
    }
}
