package com.algo;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

class Product {
	private String productName;

	Product(String name) {
		this.productName = name;
	}

	@Override
	public String toString() {
		return "Product : " + productName;
	}
}

class Producer implements Runnable {
	private BlockingQueue<Product> queue;

	public Producer(BlockingQueue<Product> queue) {
		this.queue = queue;
	}

	public void run() {
		int i = 0;
		try {
			while (!Thread.interrupted()) {
				Product p = new Product("prod " + i++);
				queue.put(p);
				TimeUnit.MILLISECONDS.sleep(200);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Consumer implements Runnable{
	private BlockingQueue<Product> queue;
	
	Consumer(BlockingQueue<Product> queue){
		this.queue = queue;
	}
	
	public void run(){
		try {
			while (!Thread.interrupted()) {
				Product p = queue.take();
				System.out.println("consumed "+p);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ProdConsWithBlockingQueue {
	
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Product> queue = new LinkedBlockingQueue<Product>();
		Producer producer = new Producer(queue);
		Consumer consumer  = new Consumer(queue);
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(producer);
		executor.execute(consumer);
		TimeUnit.SECONDS.sleep(3);
		executor.shutdownNow();
	}
}
