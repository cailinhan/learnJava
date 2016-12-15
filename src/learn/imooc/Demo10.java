/**
 * 内部类
 * 慕课网java入门第二季练习
 * 2016.12.03
 * 
 *  1.Inner 类定义在 Outer 类的内部，相当于 Outer 类的一个成员变量的位置，
 *    Inner 类可以使用任意访问控制符，如 public 、 protected 、 private等。
 *  2.Inner 类中定义的 方法可以直接访问 Outer 类中的数据，而不受访问控制符的影响。
 *  3.定义了成员内部类后，必须使用外部类对象来创建内部类对象，而不能直接去 new 一个内部类对象，
 *    即：内部类 对象名 = 外部类对象.new 内部类( );
 *  4.编译后，会发现产生了两个 .class文件 Demo10、Demo10$Inner
 */
package learn.imooc;

public class Demo10 {
	
	public String classType = "Outer";
	
	public static void main(String[] args){
		System.out.println("---------------main start--------------");
		
		/*
		 * 实例化内部类
		 */
		Demo10 demo = new Demo10();
		Inner i = demo.new Inner();
		i.show();
	}
	
	/*
	 * 创建一个内部类
	 */
	public class Inner {
		
		public String classType = "Inner";
		
		public void show(){
			// 访问自己的成员属性
			System.out.println(classType);
			// 访问外部类的成员属性，注意这个抽象的this
			System.out.println(Demo10.this.classType);
		}
		
	}
	
}
