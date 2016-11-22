/**
 * 第二种对线程方法，重载Runnable类的run方法，传给Thread对象
 * 
 * 传智播客Java多线程
 * 2016.11.22
 */
package learn.itcast;

public class TraditionalThreadDemo02 {

	public static void main(String[] args) {
		
		/*
		 * new一个Runnable对象,重载run方法
		 */
		Runnable run = new Runnable(){
			public void run(){
				while(true){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("执行线程");
				}
			}
		};
		
		/*
		 * new3个线程，传入Runnable对象，并开启运行
		 */
		Thread thread01 = new Thread(run);
		Thread thread02 = new Thread(run);
		Thread thread03 = new Thread(run);
		
		thread01.start();
		thread02.start();
		thread03.start();
	}

}