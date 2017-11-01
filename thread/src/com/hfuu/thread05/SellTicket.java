package com.hfuu.thread05;

public class SellTicket extends Thread{
	// 定义100张票
	// private int tickets = 100;
	// 为了让多个线程对象共享这100张票，我们其实应该用静态修饰
	private static int tickets =100;
	@Override
	public void run() {
		while (true) {
			if(tickets>0) {
				System.out.println(getName() + "正在出售第" + (tickets--) + "张票");
			}
			
		}
	}
}
