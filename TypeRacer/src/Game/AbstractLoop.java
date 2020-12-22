package Game;

import Window.WindowController;

abstract class AbstractLoop {

    protected WindowController controller;
    protected Mediator mediator;

    protected boolean alreadyExecuted = false;
    protected boolean gameIsRunning = true;

    public abstract void loop();

    public abstract void startTimer();

    public abstract void isFinished();
}
