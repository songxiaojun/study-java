package com.hfuu.thread03;
/**
 * 
 * @author sj
 * @data 2017��10��31��
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		MyThread thread2 = new MyThread();
		thread.setName("sss");
		thread.start();
		thread2.setName("jjj");
		thread2.start();
	}
}
