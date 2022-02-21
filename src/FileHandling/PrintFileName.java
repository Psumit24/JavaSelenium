package FileHandling;

import java.io.File;
import java.util.Arrays;

public class PrintFileName {
	public static void main(String[] args) {
		String path = "C:\\Users\\hp\\Downloads\\DOWNLOADJAN21";
		File file = new File(path);
		File downloadDir[] = file.listFiles();
		Arrays.sort(downloadDir);
		for (File e : downloadDir) {
			if (e.isFile()) {

				System.out.println("File:" + e.getName() + "  " + "Path " + e.getAbsolutePath());
			} else if (e.isDirectory()) {
				System.out.println("Directory:" + e.getName() + "   " + "Path" + e.getAbsolutePath());
			} else {
				System.out.println("Not Known:" + e.getName() + "   " + "Path " + e.getAbsolutePath());
			}
		}

	}
}
