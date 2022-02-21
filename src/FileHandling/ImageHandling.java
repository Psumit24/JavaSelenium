package FileHandling;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URL;

import javax.imageio.ImageIO;

public class ImageHandling {
public static void main(String[] args) {
	try {
	//	URL url = new URL("https://images-eu.ssl-images-amazon.com/images/G/31/img21/CEPC/Clearance/May21/D23947948_IN_CEPC_Clearance-store_May21_rush_1500x300.jpg");
	File file = new File("D:\\SUMIT 2019-20\\Sheetal bday\\1.jpg");
	
		try {
		BufferedImage image=ImageIO.read(file);
		ImageIO.write(image, "jpg", new File("D:\\Jsumit\\Daisyz\\Navven\\Sumit.jpg"));
		ImageIO.write(image, "gif", new File("D:\\Jsumit\\Daisyz\\Navven\\Sumit.gif"));
		ImageIO.write(image, "png", new File("D:\\Jsumit\\Daisyz\\Navven\\Sumit.png"));
		ImageIO.write(image, "bmp", new File("D:\\Jsumit\\Daisyz\\Navven\\Sumit.bmp"));
	System.out.println("Done.........");
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
