package Text;

import java.util.Random;

public class RandomText extends Text {
    private static RandomText single_instance = null;

    private RandomText(){

    }

    public static RandomText getInstance(){
        if (single_instance == null)
            single_instance = new RandomText();

        return single_instance;
    }

    private final Random random = new Random();
    private String randomText = null;

    private String getRandomText(){
        int rand = random.nextInt(textNumber);
        return text[rand];
    }

    @Override
    public String getText() {
        if(randomText == null) randomText = getRandomText();
        return randomText;
    }

}
