package day29;

import java.io.File;

public class FileDemo3 {
	public static void main(String[] args) {
		String filepath = "C://Users/Barsha/Desktop/Demo.txt";
		File file = new File (filepath);
		
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.canExecute());
		file.setWritable(false);
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.isHidden());
		System.out.println(file.getTotalSpace());
		System.out.println(file.getParent());
		 filepath = "C://Users/Barsha/Desktop/demo/hello.txt";
		File dest = new File (filepath);
		System.out.println("hello");
		file.renameTo(dest);
		dest.delete();
		
		
	}

}
