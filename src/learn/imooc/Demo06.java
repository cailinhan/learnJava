/**
 * 使用Arrays类对数组进行排序、打印
 * 
 * 慕课网java入门第一季练习
 * 2016.11.22
 */
package learn.imooc;

import java.util.Arrays;

public class Demo06 {

	public static void main(String[] args){
		
		int[] scores = new int[]{242,323,45,7,2222,522};
		System.out.println(Arrays.toString(scores));
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
	}
	
}
