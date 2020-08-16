package day29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo5 {
	public static void main(String[] args) {
		String filepath = "C:/Users/Barsha/Desktop/Me/BB.txt";
		
		
		try(
			FileReader fr = new FileReader(filepath);
			FileWriter fw = new FileWriter("C:/Users/Barsha/Desktop/demo/BB2.txt");
			){
			int len;
			while ((len = fr.read())!=-1) {
				System.out.println(len);
				fw.write(len);
			}
		} catch(IOException e) {
			e.printStackTrace();
		
		}// Character oriented
		
		
	}




}
