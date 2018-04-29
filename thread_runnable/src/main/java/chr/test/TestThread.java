package chr.test;

import chr.thread.MyThd;

public class TestThread {


    public static void main(String[] args) {

        MyThd th1 = new MyThd();

        th1.start();


    }
}
