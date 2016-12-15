/**
 * 变量总结
 */
package learn.note;

import java.util.Arrays;

public class Variable {

	
	public static void main(String[] args){
		
		
		System.out.println(Double.NEGATIVE_INFINITY);
		
		/*
		 * 整数类型
		 * 	byte
		 * 	short
		 * 	int
		 * 	long
		 * 字符类型
		 * 	char
		 * 浮点类型
		 * 	float
		 * 	double
		 * 布尔类型
		 * 	boolean
		 * 
		 */
		String v01 = "";
		
		String[] v02 = new String[]{"a","b"};
		String[][] v03 = new String[2][3];
		String[][] v04 = new String[][]{{"a","b","c"},{"e","f","g"}};
		String[][] v05 = {{"a","b","c"},{"e","f","g"}};
		System.out.println(v01);
		System.out.println(Arrays.toString(v02));
		System.out.println(v03);
		System.out.println(Arrays.toString(v04));
		System.out.println(Arrays.toString(v05));
		
		float v06 = (float) 0.012;
		double v07 = 0.0003;
		int v08 = 100;
		boolean v09 = false;
		System.out.println(v06);
		System.out.println(v07);
		System.out.println(v08);
		System.out.println(v09);
		int v11 = 111111;
		System.out.println(v11);
		
		System.out.println(v06);
		
//		for(int i=10; i<100; i++){
//			int v10 = 100;
//		}
//		if(true){
//			int v10 = 1000;
//		}
//		花括号里面定义的变量，不能再外部使用。
//		System.out.println(v10);
	}
	
}
