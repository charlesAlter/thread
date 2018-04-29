package chr.test;

import chr.thread.MyRun;

public class TestRun {

    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread th1 = new Thread(myRun,"th1");
        Thread th2 = new Thread(myRun,"th2");
        Thread th3 = new Thread(()-> {
            while (true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        },"th3");
        th1.start();
        th2.start();
        th3.start();
    }
}
