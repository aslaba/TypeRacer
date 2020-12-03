public class StartGame {
    public static void main(String args[]) {
        GameWindow gameWindow = new GameWindow();
        gameWindow.createWindow();
        GameLoop gameLoop = new GameLoop();
        gameLoop.loop(gameWindow);
    }
}


