package com.hfuu.thread13;
/**
 * 匿名内部类形式
 * @author sj
 * @data 2017年11月1日
 */
public class ThreadDemo {
	public static void main(String[] args) {
		//继承Thread来实现
		new Thread() {
			public void run() {
				for(int x = 0; x < 100; x++) {
					System.out.println(Thread.currentThread().getName() + ":"
							+ x);
				}
			};
		}.start();
		
		//实现Runnable接口
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int x = 0; x < 100; x++) {
					System.out.println(Thread.currentThread().getName() + ":"
							+ x);
				}
				
			}
		}) {
		}.start();
		
	}
}
