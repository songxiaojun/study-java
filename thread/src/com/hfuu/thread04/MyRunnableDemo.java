package com.hfuu.thread04;
/**
 * 
 * @author sj
 * @data 2017��10��31��
 * ��ʽ2��1.�Զ�����MyRunnable ʵ��runnable�ӿ�
 *      2.��дrun()����
 *      3.����MyRunnable��Ķ���
 *      4.����Thread��Ķ���,��3��Ϊ�������ݹ�ȥ
 */
public class MyRunnableDemo {
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable,"sss");
		thread.start();
		
	}
}
