package com.kh.SkocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientPre {
	public static void main(String[] args) {
		
		
		try {
			Socket c = new Socket("localhost", 12370);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
			
			PrintWriter out  = new PrintWriter(c.getOutputStream(), true);
			
			out.println("hi, server !");
			
			String m ;
			
			while((m=in.readLine()) != null) {
				System.out.println("send success : " + m);
				
			}
			in.close();
			out.close();
			c.close();
			
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		
		
	}
}
