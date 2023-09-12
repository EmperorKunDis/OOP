package until40;

import java.util.Random;

public class TwentyRoller {
    Random random;
    int number;

    TwentyRoller() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(20)+1;
        System.out.println(number);
    }

}
