package learn.imooc;

public class Demo20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定义一个字符串
				String s = "蔡林汉";
			
		        // 出现次数
				int num = 0;
		       
		         // 循环遍历每个字符，判断是否是字符 a ，如果是，累加次数
				for ( byte i : s.getBytes())
				{
					System.out.println(i);
		            // 获取每个字符，判断是否是字符a
					if ( i == 'a' ) {
		                // 累加统计次数
						num++;
					}
				}
				System.out.println("字符a出现的次数：" + num);
			}

}
