package chr.thread;

public class MyThd extends Thread {

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("th001");
        }
    }
}
