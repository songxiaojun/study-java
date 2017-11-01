package com.hfuu.thread05;
/**
 * 某电影院目前正在上映贺岁大片(红高粱,少林寺传奇藏经阁)，共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
 * 继承Thread类来实现。
 * @author sj
 * @data 2017年10月31日
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket t1 = new SellTicket();
		SellTicket t2 = new SellTicket();
		SellTicket t3 = new SellTicket();
		
		// 给线程对象起名字
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");

		// 启动线程
		t1.start();
		t2.start();
		t3.start();
		
	}
}
