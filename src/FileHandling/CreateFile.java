package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateFile {
	public static void main(String[] args) {
		String path = "D:\\Jsumit\\Daisyz\\Navven\\sample.text";
				File file = new File(path);
		try {
			boolean flag = file.createNewFile();
			if (flag) {
				System.err.println("file is created..");
			} else {
				System.out.println("file is already present...");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the file name with location:...");
			String fileName = sc.nextLine();
			FileOutputStream fos = new FileOutputStream(fileName, true);
			System.out.println("Enter the file content:..");
			String content =sc.nextLine();
			byte b[]= content.getBytes();
			fos.write(b);
			fos.close();
			sc.close();
			System.out.println("File save on the given loaction");
		} catch (Exception e) {
			System.out.println("Some exception is coming");
			// TODO: handle exception
		}
		System.out.println("===========================");
		//java nio package
		Path pathLocations =Paths.get("D:\\Jsumit\\Daisyz\\Navven\\newFile.text");
			try {
				Path  newPath =Files.createDirectories(pathLocations);
				System.out.println("new created path:..." +newPath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Some exception occured:...");
				e.printStackTrace();
			}
	}
	
}
