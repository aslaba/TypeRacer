package Game;

import Text.TextChecker;

public class Mediator {
    private final TextChecker textChecker = new TextChecker();
    private final StopWatch stopWatch = new StopWatch();

    public boolean check(String text){
        return textChecker.check(text);
    }

    public boolean isFinished(){
        return textChecker.isGameFinished();
    }

    public long getTime(){
        return stopWatch.getElapsedTimeSecs();
    }

    public void startTimer(){
        stopWatch.start();
    }

    public void stopTimer(){
        stopWatch.stop();
    }
}
