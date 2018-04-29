package chr.test;

import chr.thread.MyRun;

public class TestRun {

    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread th1 = new Thread(myRun,"th1");
        Thread th2 = new Thread(myRun,"th2");

        th1.start();
        th2.start();
    }
}
