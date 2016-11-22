/**
 * 循环处理二维数组
 * 
 * 慕课网java入门第一季练习
 * 2016.11.22
 */
package learn.imooc;

import java.util.Scanner;

public class Demo07 {

	public static void main(String[] args){
		
		String[][] names = new String[2][3];
		
		System.out.println("请输入");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i< names.length;i++){
			
			for(int j=0;j<names[i].length;j++){
				String name = sc.nextLine();	
				names[i][j] = name;
			}
			
		}
		
		sc.close();
		
		for(int i=0; i<names.length;i++){
			for(int j=0;j<names[i].length;j++){
				System.out.println(names[i][j]);
			}
		}
		
	}
	
}
