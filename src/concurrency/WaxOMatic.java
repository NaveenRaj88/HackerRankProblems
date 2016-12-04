package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Naveen Kumar .A on 12/3/16.
 */
public class WaxOMatic {
    public static void main(String[] args) throws InterruptedException {


        Car car = new Car();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Waxer(car));
        executorService.execute(new Buffer(car));
        TimeUnit.SECONDS.sleep(1);
        executorService.shutdownNow();
        System.out.println("Exiting main");

    }

}
class Car{
    private boolean waxOn = false;

    public synchronized void applyWax() {
        System.out.println("Applying wax");
        waxOn = true;
        notifyAll();
        System.out.println("wax Applied");
    }

    public synchronized void buffWax() {
        System.out.println("Applying buff");
        waxOn = false;
        notifyAll();
        System.out.println("buffed");
    }

    public synchronized void waitForWaxing() throws InterruptedException {
        if (!waxOn) {
            wait();
        }
    }

    public synchronized void waitForBuffing() throws InterruptedException {
        if (waxOn) {
            wait();
        }
    }
}

class Waxer implements Runnable{

    private Car car;
    public Waxer(Car car){
        this.car = car;
    }

    @Override
    public void run() {
        int count = 5;
        while(count-- >0){
            try {
                car.applyWax();
                TimeUnit.MILLISECONDS.sleep(100);
                car.waitForBuffing();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Buffer implements Runnable{

private Car car;

    public Buffer(Car car){
        this.car = car;
    }

    @Override
    public void run() {
        while(!Thread.interrupted()){
            try {
                car.waitForWaxing();
                TimeUnit.MILLISECONDS.sleep(100);
                car.buffWax();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


