package learn.imooc.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest {

	public static void main(String[] args) {
		
		// InetAddress
		// URL
		// Sockets TCP
		// Datagram UDP
		
		try {
			URL url = new URL("http://localhost:8000");
			InputStream is = url.openStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String data = br.readLine();
			while(data != null){
				System.out.println(data);
				data = br.readLine();
			}
			is.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
