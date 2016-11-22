/**
 * 使用函数
 *  
 * 慕课网java入门第一季练习
 * 2016.11.22
 */
package learn.imooc;

import java.util.Arrays;

public class Demo08 {

	public static void main(String[] args){
		
		int[] nums = new int[]{ 18 ,23 ,21 ,19 ,25 ,29 ,17};
		Demo08 demo = new Demo08();
		System.out.println("最大值为：" + demo.max(nums));
		System.out.println("最小值为：" + demo.min(nums));
		System.out.println("平均值为：" + demo.avg(nums));
		
	}
	
	public int max(int[] nums){
		/**
		 * 排序取第最后一个元素
		 */
		Arrays.sort(nums);
		return nums[nums.length-1];
	}
	
	public int min(int[] nums){
		/**
		 * 排序取第一个元素
		 */
		Arrays.sort(nums);
		return nums[0];
	}
	
	public double avg(int[] nums){
		/**
		 * 求和取平均数
		 */
		int sum = 0;
		for(int i=0; i<nums.length; i++){
			sum += nums[i];
		}
		return (double)sum / nums.length;
	}
}
