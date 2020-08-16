package day29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo6 {
	public static void main(String[] args) {
		String filepath = "C:/Users/Barsha/Desktop/Me/BB.txt";
		
		
		try(
			FileReader fr = new FileReader(filepath);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("C:/Users/Barsha/Desktop/demo/BB3.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			){
			String len;
			while ((len = br.readLine())!=null) {
				System.out.println(len);
				bw.write(len);
				bw.newLine();
			}
		} catch(IOException e) {
			e.printStackTrace();
		
		}// Character oriented
		
		
	}


}
