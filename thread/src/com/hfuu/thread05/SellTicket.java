package com.hfuu.thread05;

public class SellTicket extends Thread{
	// ����100��Ʊ
	// private int tickets = 100;
	// Ϊ���ö���̶߳�������100��Ʊ��������ʵӦ���þ�̬����
	private static int tickets =100;
	@Override
	public void run() {
		while (true) {
			if(tickets>0) {
				System.out.println(getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
			}
			
		}
	}
}
