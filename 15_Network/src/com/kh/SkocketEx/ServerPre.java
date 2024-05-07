package com.kh.SkocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
//채팅 시작 주최자
//port 2자리 3자리 4자리 컴퓨터에서 약속으로 지정한 숫자

public class ServerPre {
	public static void main(String[] args) {
	
		
		try {
			ServerSocket server = new ServerSocket(12370);
			System.out.println("party chat open");
			
			Socket clientSocket  = server.accept();
			System.out.println("client success");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
			String message ;
			
			while((message = in.readLine())!=null) {
				System.out.println("send " + message);
				out.println("success " + message);
				
			}
			clientSocket.close();
			server.close();
			
		} catch (IOException e) {
			
			
			e.printStackTrace();
		
		}
	}
}
