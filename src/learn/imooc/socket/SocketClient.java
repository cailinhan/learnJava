package learn.imooc.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
	public static void main(String[] args) {
		try {
			
			Socket skt = new Socket("127.0.0.1",8000);
			OutputStream os = skt.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			pw.write("用户名：admin;密码:123");
			pw.flush();
			skt.shutdownOutput();
			pw.close();
			os.close();
			skt.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
