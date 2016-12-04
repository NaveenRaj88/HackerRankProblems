package concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by Naveen Kumar .A on 12/3/16.
 */
public class ReusingThreads extends Thread{

    @Override
    public void run() {
        try{
            TimeUnit.MILLISECONDS.sleep(100);
        }catch (InterruptedException ex){
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReusingThreads rt = new ReusingThreads();
        rt.start();
        TimeUnit.MILLISECONDS.sleep(300);
        rt.start();
        TimeUnit.SECONDS.sleep(2);
    }
}
