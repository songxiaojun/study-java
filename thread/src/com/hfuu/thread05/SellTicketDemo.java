package com.hfuu.thread05;
/**
 * ĳ��ӰԺĿǰ������ӳ�����Ƭ(�����,�����´���ؾ���)������100��Ʊ��������3����Ʊ������Ʊ�������һ������ģ��õ�ӰԺ��Ʊ��
 * �̳�Thread����ʵ�֡�
 * @author sj
 * @data 2017��10��31��
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket t1 = new SellTicket();
		SellTicket t2 = new SellTicket();
		SellTicket t3 = new SellTicket();
		
		// ���̶߳���������
		t1.setName("����1");
		t2.setName("����2");
		t3.setName("����3");

		// �����߳�
		t1.start();
		t2.start();
		t3.start();
		
	}
}
