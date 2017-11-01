package com.hfuu.thread08;
/**
 * 死锁问题
 * @author sj
 * @data 2017年10月31日
 */
public class DieLockDemo {
	public static void main(String[] args) {
		DieLock dl1 = new DieLock(true);
		DieLock dl2 = new DieLock(false);

		dl1.start();
		dl2.start();
	}
}
