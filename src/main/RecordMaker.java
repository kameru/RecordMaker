package main;

/**
 * Created by miri on 2016-05-21.
 */
public class RecordMaker {
    public static void main(String args[]) {
        for(int i =0; i<3; i++) {
            Worker worker = Worker.makeRecord();
            System.out.println(worker.number + " " + worker.score);
        }
    }
}
