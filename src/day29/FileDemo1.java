package day29;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
public static void main(String[] args) {
		String filepath = "C://Users/Barsha/Desktop/Demo.pdf";
		File file = new File (filepath);
		try {
		if (file.createNewFile()) {
		
			
				System.out.println("file is created");
			
		}else {
		System.out.println("OOPS! file already exists.");
		}
		}catch(IOException e) {
			e.printStackTrace();
		
	
}
}
}

