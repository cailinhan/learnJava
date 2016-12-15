package learn.imooc;
public class Demo15 {
	
	final int a;
	
	public Demo15(){
		a=123; //属性的值只能初始化一次,构造函数，或者直接初始化
	}
	
	public static void main(String[] args){
		new Demo14().eat();
		
		final int a = 'c';
		final char b = 99;
		
		System.out.println(a);
		System.out.println(b);
		
		//调用父类 super.age
		
		//父类的构造方法
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo15 other = (Demo15) obj;
		if (a != other.a)
			return false;
		return true;
	}
}
