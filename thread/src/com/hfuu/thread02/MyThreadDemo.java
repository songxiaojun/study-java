package com.hfuu.thread02;
/**
 * 
 * @author sj
 * @data 2017��10��31��
 * 
 * �������߳����ַ�ʽһ�̳�thread�� ��.ʵ��runnable�ӿ�
 * ��ʽһ��1.�Զ�����MyThread �̳� Thread��
 *       2.��дrun����
 *       3.��������
 *       4.�����߳�
 */

public class MyThreadDemo {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		MyThread thread2 = new MyThread();
		thread.start();
		thread2.start();
	}

}
