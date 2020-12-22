package Game;

import Window.WindowController;

public class GameLoop extends AbstractLoop {

    public GameLoop(){
        mediator = new Mediator();
        controller = new WindowController();
        controller.createWindow();
    }

    @Override
    public void loop() {
        while(gameIsRunning){
            if (controller.getGameStarted() && mediator.check(controller.getInputText())) {
                startTimer();
                controller.setGreenColor();
                isFinished();
            }
            else{
                controller.setRedColor();
            }

            controller.setTime(mediator.getTime());
        }
    }

    @Override
    public void startTimer(){
        if(!alreadyExecuted) {
            mediator.startTimer();
            alreadyExecuted = true;
        }
    }

    @Override
    public void isFinished(){
        if (mediator.isFinished()) {
            mediator.stopTimer();
            controller.gameFinished(mediator.getTime());
            gameIsRunning = false;
        }
    }
}
