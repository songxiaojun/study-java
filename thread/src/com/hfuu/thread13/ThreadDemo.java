package com.hfuu.thread13;
/**
 * �����ڲ�����ʽ
 * @author sj
 * @data 2017��11��1��
 */
public class ThreadDemo {
	public static void main(String[] args) {
		//�̳�Thread��ʵ��
		new Thread() {
			public void run() {
				for(int x = 0; x < 100; x++) {
					System.out.println(Thread.currentThread().getName() + ":"
							+ x);
				}
			};
		}.start();
		
		//ʵ��Runnable�ӿ�
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
