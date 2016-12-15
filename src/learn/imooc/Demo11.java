/**
 * 静态内部类
 * 慕课网java入门第二季练习
 * 2016.12.03
 * 1、 静态内部类不能直接访问外部类的非静态成员，但可以通过 new 外部类().成员 的方式访问 
 * 2、 如果外部类的静态成员与内部类的成员名称相同，可通过“类名.静态成员”访问外部类的静态成员；
 *    如果外部类的静态成员与内部类的成员名称不相同，则可通过“成员名”直接调用外部类的静态成员
 * 3、 创建静态内部类的对象时，不需要外部类的对象，可以直接创建 内部类 对象名= new 内部类();
 */
package learn.imooc;

public class Demo11 {

	private int num = 99;
	private static int num2 = 70;
	private static int num3 = 60;
	public static void main(String[] args){
		System.out.println("---------------main start--------------");
		new Inner().show();
	}
	
	
	public static class Inner{
		
		private int num = 88;
		
		public void show(){
			System.out.println("外部成员");
			System.out.println(new Demo11().num);
			System.out.println(num2);
			System.out.println(Demo11.num3);
			System.out.println("内部静态类成员");
			System.out.println(num);
		}
	}
}
