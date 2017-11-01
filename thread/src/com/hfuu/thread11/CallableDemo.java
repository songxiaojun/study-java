package com.hfuu.thread11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		pool.submit(new MyCallable());
		pool.submit(new MyCallable());
		
		//½áÊø
		pool.shutdown();
		
	}
}
