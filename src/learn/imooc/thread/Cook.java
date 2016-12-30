package learn.imooc.thread;

public class Cook implements Runnable {

	volatile boolean working = true;

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while(working) {
			
			System.out.println(Thread.currentThread().getName());
			Thread.yield();
			
		}
	}

}
