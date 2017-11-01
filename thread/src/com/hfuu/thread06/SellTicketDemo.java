package com.hfuu.thread06;
/**
 * 实现Runnable方式实现
 * @author sj
 * @data 2017年10月31日
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket s1 = new SellTicket();
		
		Thread t1 = new Thread(s1,"窗口1");
		Thread t2 = new Thread(s1,"窗口2");
		Thread t3 = new Thread(s1,"窗口3");
		t1.start();
		t2.start();
		t3.start();
	}
}
