package com.hfuu.thread06;

public class SellTicket implements Runnable {
	private static int tickets = 100;
	private Object obj = new Object();
	@Override
	public void run() {
		while(true) {
			synchronized (obj) {
				
				if(tickets>0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "���ڳ��۵�"
							+ (tickets--) + "��Ʊ");
				}
			}
		}

	}

}
