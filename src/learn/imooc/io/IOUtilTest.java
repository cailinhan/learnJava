package learn.imooc.io;

import java.io.File;
import java.io.IOException;

public class IOUtilTest {
	
	public static void main(String[] args) throws IOException{
		
//		try {
//			IOUtil.printHexByByteArray("C:\\Users\\cailh\\Documents\\Shadowsocks\\pac.txt");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		FileOutputStream out = new FileOutputStream("C:\\Users\\cailh\\workspace\\learn\\src\\learn\\imooc\\io\\demo\\data.dat");
//		int a = 9899;
//		out.write(a >>> 24);
//		out.write(a >>> 16);
//		out.write(a >>> 8);
//		out.write(a);
//		out.close();
//		
		try {
			File src = new File("data\\data.dat");
			File desc = new File("data\\desc.dat");
			
			IOUtil.coryFile(src, desc);
//			IOUtil.printHexByByteArray("C:\\Users\\cailh\\workspace\\learn\\src\\learn\\imooc\\io\\demo\\data.dat");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
