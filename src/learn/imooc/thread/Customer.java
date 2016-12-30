package learn.imooc.thread;

public class Customer implements Runnable {

	//volatile保证线程可以正确的读取其他线程写入的值 
	//REF JMM happens-before原则
	volatile boolean eating = true;

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while(eating) {
			
			System.out.println(Thread.currentThread().getName());
			Thread.yield();
			
		}
	}

}
