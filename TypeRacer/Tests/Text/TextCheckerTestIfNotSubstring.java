package Text;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TextCheckerTestIfNotSubstring {
    @Test
    public void testTextChecker(){
        String str = "Hello";
        String str1 = str.substring(0, 2) + "p";
        TextChecker testChecker = new TextChecker();
        testChecker.setText(str);
        Assertions.assertFalse(testChecker.check(str1));
    }
}
