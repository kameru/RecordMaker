package main;

import java.util.ArrayList;
import java.util.Random;

public class Worker {
    String number;
    int score;
    static ArrayList checker = new ArrayList();

    public Worker(String number, int score) {
        this.number = number;
        this.score = score;
    }

    public static Worker makeRecord() {
        Random random = new Random();
        int workerNumber;
        int scoreNumber;

        while(true) {
            workerNumber = random.nextInt(100000);
            if(!checker.contains(workerNumber))
                break;
        }
        checker.add(workerNumber);

        scoreNumber = random.nextInt(101);

        return new Worker("NT"+String.format("%05d",workerNumber),scoreNumber);
    }

}
