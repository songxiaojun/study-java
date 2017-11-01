package com.hfuu.thread07;

import sun.util.resources.cldr.es.TimeZoneNames_es_419;

/**
 * 用lock解决线程不安全问题
 * @author sj
 * @data 2017年10月31日
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket s = new SellTicket();
		Thread t = new Thread(s,"窗口1");
		Thread t2 = new Thread(s,"窗口2");
		Thread t3 = new Thread(s,"窗口3");
		t.start();
		t2.start();
		t3.start();
	}
}
