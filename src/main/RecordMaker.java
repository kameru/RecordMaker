package main;

public class RecordMaker {
    public static void main(String args[]) {
        for(int i = 0; i < Integer.parseInt(args[0]); i++) {
            Worker worker = Worker.makeRecord();
            System.out.println(worker.number + " " + worker.score);
        }
    }
}
