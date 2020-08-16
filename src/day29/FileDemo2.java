package day29;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		String filepath = "C://Users/Barsha/Desktop/demo";
		File file = new File (filepath);
		if (file.mkdir()) {
			System.out.println("directory created...");
		}else {
			System.out.println("already exists..");
		}
	

}
}
