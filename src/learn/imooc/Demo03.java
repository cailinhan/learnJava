/**
 * 使用Scanner从命令行读取内容
 * 
 * 慕课网java入门第一季练习
 * 2016.11.22
 */
package learn.imooc;

import java.util.Scanner;

public class Demo03 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();
		int count = 0;
		while(score < 60){
			score++;
			count++;
		}
		System.out.print("需要加分:"+count);
	
	}
	
}
