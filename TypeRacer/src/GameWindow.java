import javax.swing.*;
import java.awt.*;

public class GameWindow {
    private boolean gameStarted = false;

    private Text Text = new Text();

    private JPanel typeThisPanel = new JPanel();
    private JLabel typeThis = new JLabel("Type this sentence:");

    private JPanel outputTextPanel = new JPanel();
    private JLabel outputText = new JLabel(Text.getText());

    private JTextField inputText = new JTextField();

    private JPanel timePanel = new JPanel();
    private JLabel timeText = new JLabel("TIME: ");
    private JLabel time = new JLabel("0");

    private JPanel gameFinishedPanel = new JPanel();
    private JLabel gameFinished = new JLabel();

    public void createWindow(){
        JFrame frame = new JFrame("Type Racer");
        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
        frame.setLayout(boxLayout);

        JButton startGame = new JButton("START");
        startGame.addActionListener(e -> {
            inputText.setText("");
            gameStarted = true;
        });

        typeThisPanel.setPreferredSize(new Dimension(1000, 50));
        typeThisPanel.add(typeThis);

        outputText.setForeground(Color.blue);
        outputTextPanel.setPreferredSize(new Dimension(1000, 50));
        outputTextPanel.add(outputText);

        timePanel.setPreferredSize(new Dimension(1000, 50));
        timePanel.add(timeText);
        timePanel.add(time);

        gameFinishedPanel.setPreferredSize(new Dimension(1000, 400));
        gameFinishedPanel.add(gameFinished);

        frame.add(typeThisPanel);
        frame.add(outputTextPanel);
        frame.add(inputText);
        frame.add(timePanel);
        frame.add(gameFinishedPanel);
        frame.add(startGame);

        frame.setVisible(true);
    }

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
