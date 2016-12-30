package learn.imooc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOUtil {
	
	public static void printHex(String fileName) throws IOException{
		FileInputStream fIn = new FileInputStream(fileName);
		int b;
		int i = 1;
		while((b = fIn.read())!=-1){
			if(b < 0xF)
				System.out.print("0");
			System.out.print(Integer.toHexString(b).toUpperCase() + " ");
			if(i++%10 == 0){
				System.out.println();
			}
		}
		fIn.close();
	}
	
	public static void printHexByByteArray(String filename) throws IOException{
		FileInputStream fIn = new FileInputStream(filename);
		byte[] buf = new byte[20 * 1024];
		int bytes = fIn.read(buf,0,buf.length);
		fIn.close();
		for(int i=1; i<bytes+1; i++){
			if(buf[i-1] < 0xF){
				System.out.print("0");
			}
			System.out.print(Integer.toHexString(buf[i-1]).toUpperCase() + " ");
			if(i%10 == 0){
				System.out.println();
			}
		}
	}
	
	public static void coryFile(File src, File desc) throws IOException{
		if(!src.exists()){
			throw new IllegalArgumentException(src + "不存在");
		}
		if(!src.isFile()){
			throw new IllegalArgumentException(src + "不是文件");
		}
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(desc);
		byte[] buf = new byte[8 * 1024];
		int b;
		while( (b = in.read(buf, 0, buf.length))!=-1 ){
			out.write(buf, 0, b);
			out.flush();
		}
		in.close();
		out.close();
	}
}
