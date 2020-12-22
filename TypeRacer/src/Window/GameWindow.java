package Window;

import Text.RandomText;

import javax.swing.*;
import java.awt.*;

public class GameWindow {
    protected boolean gameStarted = false;

    private final JPanel typeThisPanel = new JPanel();
    private final JLabel typeThis = new JLabel("Type this sentence:");

    RandomText text = RandomText.getInstance();
    private final JPanel outputTextPanel = new JPanel();
    protected final JLabel outputText = new JLabel(text.getText());

    protected JTextField inputText = new JTextField();

    private final JPanel timePanel = new JPanel();
    private final JLabel timeText = new JLabel("TIME: ");
    protected JLabel time = new JLabel("0");

    private final JPanel gameFinishedPanel = new JPanel();
    protected JLabel gameFinished = new JLabel();

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
}
