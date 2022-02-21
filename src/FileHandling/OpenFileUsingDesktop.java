package FileHandling;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OpenFileUsingDesktop {
	public void testM1() {
		// TODO Auto-generated method stub
		String path = "D:\\Jsumit\\Daisyz\\Navven\\sample.text";
		try {
			File file = new File(path);
			if (!Desktop.isDesktopSupported()) {
				System.out.println("Desktop Not Supported....");
				return;
			}
			Desktop desktop = Desktop.getDesktop();
			if (file.exists()) {
				desktop.open(file);

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void testM2() {
		// TODO Auto-generated method stub
		String path = "D:\\Jsumit\\Daisyz\\Navven\\sample.text";
		FileInputStream fis = null;
		try {
			File file = new File(path);
			fis = new FileInputStream(file);
			System.out.println("File content is...");
			int c = 0;
			while ((c = fis.read()) != -1) {
				System.out.print((char) c);

			}
		}

		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void test03() {
		// TODO Auto-generated method stub
		String path = "D:\\Jsumit\\Daisyz\\Navven\\sample.text";
		BufferedReader br = null;
		try {
			File file = new File(path);
			br = new BufferedReader(new FileReader(file));
			System.out.println("File content is...");
			int c = 0;
			while ((c = br.read()) != -1) {
				System.out.print((char) c);
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void test04() {
		// TODO Auto-generated method stub
		String path = "D:\\Jsumit\\Daisyz\\Navven\\sample.text";
		FileReader fr = null;
		try {
			File file = new File(path);
			fr = new FileReader(file);
			System.out.println("File content is...");
			int c = 0;
			while ((c = fr.read()) != -1) {
				System.out.print((char) c);
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	public void test05() {
		// TODO Auto-generated method stub
		String path = "D:\\Jsumit\\Daisyz\\Navven\\sample.text";
		Scanner sc  = null;
		try {
			File file = new File(path);
			 sc = new Scanner(file);
			System.out.println("File content is...");
			
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
				sc.close();
			}
		}

	

	public static void main(String[] args) {
		// new OpenFileUsingDesktop().testM1();
		// new OpenFileUsingDesktop().testM2();
		// new OpenFileUsingDesktop().test03();
		//new OpenFileUsingDesktop().test04();
		new OpenFileUsingDesktop().test05();
	}
}
