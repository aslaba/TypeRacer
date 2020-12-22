package Window;

import java.awt.*;

public class WindowController extends GameWindow {

    public String getInputText() {
        return inputText.getText();
    }

    public void setGreenColor(){
        inputText.setForeground(Color.blue);
    }

    public void setRedColor(){
        inputText.setForeground(Color.red);
    }

    public void setTime(long time) {
        this.time.setText(Long.toString(time));
    }

    public void gameFinished(long time){
        gameFinished.setText("Game is finished. Your time: " + time + " seconds");
    }

    public boolean getGameStarted() {
        return gameStarted;
    }
}
