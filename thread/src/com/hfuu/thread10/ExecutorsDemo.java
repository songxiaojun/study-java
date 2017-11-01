package com.hfuu.thread10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池的好处：线程池里的每一个线程结束后，并不会死亡，而是在回到线程池中成为空闲状态，等待下一个对象来使用
 * 
 * 如何创建线程池的代码呢？
 * A：创建一个线程池对象，控制要创建几个线程对象
 * 		public static ExecutorService newFixedThreadPool(int nThreads)
 * B:这种线程池的线程可以执行：
 * 		可以执行Runnable对象或者Callable对象代表的线程
 * C：调用如下方法：
 * 		Future<?> submit(Runnable task)
 *      <T> Future<T> submit(Callable<T> task)
 * D:结束
 * @author sj
 * @data 2017年11月1日
 */
public class ExecutorsDemo {
	public static void main(String[] args) {
		// 创建一个线程池对象，控制要创建几个线程对象。
		ExecutorService pool = Executors.newFixedThreadPool(2);
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());
		
		//结束线程池
		pool.shutdown();
		
	}
}
