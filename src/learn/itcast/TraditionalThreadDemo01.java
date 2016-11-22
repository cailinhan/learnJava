/**
 * 第一种多线程使用方法，重载Thread类的Run方法
 * 
 * 传智播客Java多线程
 * 2016.11.22
 * 
 */
package learn.itcast;

public class TraditionalThreadDemo01 {

	public static void main(String[] args){
	
		/*
		 * new两个Thread对象，分别重载run方法
		 */
		Thread thread01 = new Thread(){
			public void run(){
				while(true){
					System.out.println("线程1运行");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread thread02 = new Thread(){
			public void run(){
				while(true){
					System.out.println("线程2运行");
					try {
						Thread.sleep(1001);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		/*
		 * 开启
		 */
		thread01.start();
		thread02.start();
	}
	
}