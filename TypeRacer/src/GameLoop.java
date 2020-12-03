public class GameLoop {
    public void loop(GameWindow gameWindow) {
        TextChecker textChecker = new TextChecker();

        StopWatch stopWatch = new StopWatch();

        boolean alreadyExecuted = false;
        boolean gameIsRunning = true;
        
        while(gameIsRunning){
            if (gameWindow.getGameStarted() && textChecker.check(gameWindow.getInputText())) {
                if(!alreadyExecuted) {
                    stopWatch.start();
                    alreadyExecuted = true;
                }

                gameWindow.setGreenColor();

                if (textChecker.isGameFinished()) {
                    stopWatch.stop();
                    gameWindow.gameFinished(stopWatch.getElapsedTimeSecs());
                    gameIsRunning = false;
                }
            }
            else {
                gameWindow.setRedColor();
            }

            gameWindow.setTime(stopWatch.getElapsedTimeSecs());
        }
    }
}
