/**
 * 循环累加
 * 
 * 慕课网java入门第一季练习
 * 2016.11.22
 */
package learn.imooc;

public class Demo02 {

	public static void main(String[] args) {
		int score = 53;
		int count = 0;
		System.out.println("加分前成绩："+score);
		while(score<60){
			score++;
			count++;
		}
		System.out.println("加分后成绩："+score);
		System.out.println("加分："+ count);

	}

}
