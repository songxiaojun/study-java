package com.hfuu.thread10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳صĺô����̳߳����ÿһ���߳̽����󣬲����������������ڻص��̳߳��г�Ϊ����״̬���ȴ���һ��������ʹ��
 * 
 * ��δ����̳߳صĴ����أ�
 * A������һ���̳߳ض��󣬿���Ҫ���������̶߳���
 * 		public static ExecutorService newFixedThreadPool(int nThreads)
 * B:�����̳߳ص��߳̿���ִ�У�
 * 		����ִ��Runnable�������Callable���������߳�
 * C���������·�����
 * 		Future<?> submit(Runnable task)
 *      <T> Future<T> submit(Callable<T> task)
 * D:����
 * @author sj
 * @data 2017��11��1��
 */
public class ExecutorsDemo {
	public static void main(String[] args) {
		// ����һ���̳߳ض��󣬿���Ҫ���������̶߳���
		ExecutorService pool = Executors.newFixedThreadPool(2);
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());
		
		//�����̳߳�
		pool.shutdown();
		
	}
}
