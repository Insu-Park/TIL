package chat.server;

import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(9999);
			System.out.println("server ready...");
			Socket s=ss.accept();
			System.out.println(s.getInetAddress()+"님 접속");
			DataInputStream in=new DataInputStream(s.getInputStream());
			String msg=in.readUTF();
			System.out.println(msg);
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}
}
