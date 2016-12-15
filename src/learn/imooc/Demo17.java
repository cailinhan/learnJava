package learn.imooc;

public class Demo17 {
	
	public static void main(String[] args){
		
		Demo16 demo = new Demo16();
		
		Demo16 demo2 = new Demo16();
		
		demo.setCpu(2);
		demo.setMem(1000);
		demo.setName("XIAOMI");
		
		demo2.setCpu(2);
		demo2.setMem(1000);
		demo2.setName("XIAOMI");
		
		boolean result = demo.equals(demo2);
		
		
		System.out.println(result);
	}
}
