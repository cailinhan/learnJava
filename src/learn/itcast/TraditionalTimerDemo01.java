/**
 * 定时器的使用
 * 
 * 传智播客Java多线程
 * 2016.11.22
 */
package learn.itcast;

import java.util.Timer;
import java.util.TimerTask;

public class TraditionalTimerDemo01 {

	public static void main(String[] args){
		
		/*
		 * 创建一个定时器，传入一个重写run方法的TimerTask
		 */
		new Timer().schedule(new TimerTask(){
			public void run(){
				System.out.println("timer");
			}
		}, 3000,1000);
	}
}