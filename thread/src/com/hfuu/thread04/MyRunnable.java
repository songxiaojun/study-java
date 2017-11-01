package com.hfuu.thread04;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}

	}

}
