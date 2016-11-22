/**
 * 函数的重载
 * 
 * 慕课网java入门第一季练习
 * 2016.11.22
 */
package learn.imooc;

public class Demo09 {

	public static void main(String[] args) {
		int[] nums = new int[]{ 18 ,23 ,21 ,19 ,25 ,29 ,17};
		String[] numsString = new String[]{"18" ,"23" ,"21" ,"19" ,"25" ,"29" ,"17"};
		Demo09 demo = new Demo09();
		System.out.println("Integert Array' Avg :" +  demo.avg(nums));
		System.out.println("String Array' Avg :" +  demo.avg(numsString));
	}
	
	public double avg(int[] nums){
		int sum = 0;
		for(int i=0; i<nums.length; i++){
			sum += nums[i];
		}
		return (double)sum / nums.length;
	}
	
	public double avg(String[] nums){
		int sum = 0;
		for(int i=0; i<nums.length; i++){
			sum += Integer.valueOf(nums[i]).intValue();
		}
		return (double)sum / nums.length;
	}
}
