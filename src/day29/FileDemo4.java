package day29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo4 {
	public static void main(String[] args) {
		String filepath = "C:/Users/Barsha/Desktop/Me/BB.txt";
		FileInputStream fis = null; //as it throws exception
		FileOutputStream fos = null; 
		
		try{
			fis = new FileInputStream(filepath);
			fos = new FileOutputStream("C:/Users/Barsha/Desktop/demo/BB1.txt");
			int len;
			while ((len = fis.read())!=-1) {
				System.out.println(len);
				fos.write(len);
			}
			throw new Exception();
		} catch(Exception e) {
//			System.out.println(e);
			e.printStackTrace();
			return;
		} finally {
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("hello");
		}
		
		
//		fis.close();
	}

}
