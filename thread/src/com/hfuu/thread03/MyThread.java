package com.hfuu.thread03;

public class MyThread extends Thread {
	
	public MyThread() {
	}
	
	public MyThread(String name) {
		super(name);
	}


	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(getName()+":"+i);
		}
	}
}
