package cl.demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IODemo {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		InputStream is = new FileInputStream("C:\\Users\\chenli\\Desktop\\demo.txt");
		InputStreamReader ir = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(ir);
		String temp = "";
		String content = "";
		while ((temp = br.readLine()) != null) {
			content += temp + "\r";
		}
		System.out.println(content);
//		char[] ac = new char[10];
//		ir.read(ac);
//		String result = new String(ac);
//		System.out.println(result);
		MyNumber my = new MyNumber();
		Thread th = new Thread(my);
		Thread th1 = new Thread(my);
		th.start();
		th1.start();
		Thread.currentThread().notify();

	}
	
}
