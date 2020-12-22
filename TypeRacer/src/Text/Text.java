package Text;

public class Text {
    protected int textNumber = 4;
    protected String[] text = new String[textNumber];

    public Text(){
        text[0] = "This is a test.";
        text[1] = "Far far away, behind the word mountains.";
        text[2] = "Separated they live in Bookmarksgrove.";
        text[3] = "A small river named Duden.";
    }

    public String getText() {
        return text[0];
    }
}
