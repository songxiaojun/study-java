package com.hfuu.thread06;
/**
 * ʵ��Runnable��ʽʵ��
 * @author sj
 * @data 2017��10��31��
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket s1 = new SellTicket();
		
		Thread t1 = new Thread(s1,"����1");
		Thread t2 = new Thread(s1,"����2");
		Thread t3 = new Thread(s1,"����3");
		t1.start();
		t2.start();
		t3.start();
	}
}
