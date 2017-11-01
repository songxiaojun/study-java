package com.hfuu.thread04;
/**
 * 
 * @author sj
 * @data 2017年10月31日
 * 方式2：1.自定义类MyRunnable 实现runnable接口
 *      2.重写run()方法
 *      3.创建MyRunnable类的对象
 *      4.创建Thread类的对象,把3作为参数传递过去
 */
public class MyRunnableDemo {
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable,"sss");
		thread.start();
		
	}
}
