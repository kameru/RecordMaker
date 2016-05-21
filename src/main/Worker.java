package main;

import java.util.Random;

/**
 * Created by miri1 on 2016-05-21.
 */
public class Worker {
    String number;
    int score;

    public Worker(String number, int score) {
        this.number = number;
        this.score = score;
    }

    public static Worker makeRecord() {
        Random random = new Random();
        int workerNumber = random.nextInt(100000);
        int scoreNumber = random.nextInt(101);

        return new Worker("NT"+String.format("%05d",workerNumber),scoreNumber);
    }

}
