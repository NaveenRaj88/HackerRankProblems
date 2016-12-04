package concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Naveen Kumar .A on 12/3/16.
 */
public class PrintAlternativeCharacters {

    public static void main(String[] args) {
        Printer printer = new Printer();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new OddPrinter(printer));
        executor.execute(new EvenPrinter(printer));
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}


class Printer {
    public char c = 65;

    public  void printNextChar(String threadName) {
        System.out.println("printing "+(int)c + c + " by " + threadName);
        c++;
    }

    public int getCharValue() {
        return c;
    }
}

class EvenPrinter implements Runnable {

    Printer printer;

    public EvenPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        synchronized (printer) {
            while (printer.getCharValue() < 91) {
                printer.printNextChar("EvenPrinter");
                printer.notifyAll();
                try {
                    printer.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            printer.notifyAll();
        }
    }
}


class OddPrinter implements Runnable {

    Printer printer;

    public OddPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        synchronized (printer) {
            while (printer.getCharValue() < 91) {
                printer.printNextChar("OddPrinter");
                printer.notifyAll();
                try {
                    printer.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            printer.notifyAll();
        }
    }
}