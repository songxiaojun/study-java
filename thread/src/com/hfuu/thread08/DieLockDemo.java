package com.hfuu.thread08;
/**
 * ��������
 * @author sj
 * @data 2017��10��31��
 */
public class DieLockDemo {
	public static void main(String[] args) {
		DieLock dl1 = new DieLock(true);
		DieLock dl2 = new DieLock(false);

		dl1.start();
		dl2.start();
	}
}
