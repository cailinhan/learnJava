/**
 * 方法内部类
 * 慕课网java入门第二季练习
 * 2016.12.03
 */
package learn.imooc;

public class Demo12 {

	public static void main(String[] args){
		
		new Demo12().show();
	}
	
	public void show(){
		class Inner{
			public void fuck(){
				System.out.println("这有什么用呢!");
			}
		}
		
		new Inner().fuck();
	}
}
