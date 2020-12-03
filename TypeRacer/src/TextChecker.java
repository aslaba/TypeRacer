public class TextChecker {

    private String text;
    private String inputText;
    private boolean correct = true;

    public TextChecker() {
        Text text = new Text();
        this.text = text.getText();
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
