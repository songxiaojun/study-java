package com.hfuu.thread07;

import sun.util.resources.cldr.es.TimeZoneNames_es_419;

/**
 * ��lock����̲߳���ȫ����
 * @author sj
 * @data 2017��10��31��
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket s = new SellTicket();
		Thread t = new Thread(s,"����1");
		Thread t2 = new Thread(s,"����2");
		Thread t3 = new Thread(s,"����3");
		t.start();
		t2.start();
		t3.start();
	}
}
