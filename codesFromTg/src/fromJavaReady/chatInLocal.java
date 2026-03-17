package fromJavaReady;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chatInLocal {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8888);
		Socket socket = server.accept();
		System.out.println("Client connected");
		
		Socket socket1 = new Socket("192.168.0.1", 8888);
		System.out.println("Connecting to server...");
		BufferedReader in = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
		
		PrintWriter out = new PrintWriter(socket1.getOutputStream(),true);
		System.out.println("Hello from Client!");
		
		new Thread(() -> {
		    while (true)
				try {
					System.out.println(in.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}).start();
		
		Scanner sc = new Scanner(System.in);
		while (true) out.println(sc.nextLine());
	}
}
