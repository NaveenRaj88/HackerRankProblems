package com.code.quiz;

/**
 * Created by Naveen Kumar .A on 12/9/16.
 */

class ThreadEx extends Thread{
    ThreadEx(){

    }

    ThreadEx(Runnable r){
        super(r);
    }

    public void run(){
        System.out.println("Inside ThreadEx");
    }
}

class RunnableEx implements Runnable{
    public void run(){
        System.out.println("Inside RunnableEx");
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        new ThreadEx().start();
        new ThreadEx(new RunnableEx()).start();
    }

}
