package com.hfuu.thread02;
/**
 * 
 * @author sj
 * @data 2017年10月31日
 * 
 * 创建多线程两种方式一继承thread类 二.实现runnable接口
 * 方式一：1.自定义类MyThread 继承 Thread类
 *       2.重写run方法
 *       3.创建对象
 *       4.启动线程
 */

public class MyThreadDemo {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		MyThread thread2 = new MyThread();
		thread.start();
		thread2.start();
	}

}
