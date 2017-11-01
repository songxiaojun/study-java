package com.hfuu.thread07;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable{
	private static int ticketis = 100;
	//定义锁
	private Lock lock = new ReentrantLock();
	@Override
	public void run() {
		while(true) {
			try {
				lock.lock();//加锁
				Thread.sleep(100);
				if(ticketis>0) {
					System.out.println(Thread.currentThread().getName()
							+ "正在出售第" + (ticketis--) + "张票");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				lock.unlock();//释放锁
			}
		}
		
	}

}
