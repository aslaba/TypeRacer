package Text;

public class TextChecker {

    private String inputText;
    private boolean correct = true;
    private String text;

    public TextChecker() {
        RandomText randomText = RandomText.getInstance();
        text = randomText.getText();
    }

    public void setText(String text){
        this.text = text;
    }

    public boolean check(String inputText){
        if(inputText != null) {
            this.inputText = inputText;
            int inputTextLength = inputText.length();

            if (inputTextLength <= text.length()) {
                String textPart = text.substring(0, inputTextLength);
                correct = inputText.equals(textPart);
            }
            else {correct = false;}
        }
        return correct;
    }

    public boolean isGameFinished(){
        return inputText.equals(text);
    }
}
