package learn.imooc.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class SocketServer {

	private static int port = 8000;
	public static void main(String[] args) {
		
		try {
			
			ServerSocket ss = new ServerSocket(port);
			
			System.out.println("=====服务器监听" + port + "端口======");

			Socket sc = ss.accept();
			
			InputStream is = sc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String info = null;
			while((info = br.readLine()) != null ) {
				System.out.println("Receive:" + info);
			}
			System.out.println("====Server Close ====");
			sc.shutdownInput();
			
			
			
			br.close();
			isr.close();
			is.close();
			sc.close();
			ss.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
