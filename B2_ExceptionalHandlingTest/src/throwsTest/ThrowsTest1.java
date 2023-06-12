package throwsTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ThrowsTest1 {

	public static void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub
		validatefile();
//	try {
//		validatefile();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}


	
	

	}
	public static void validatefile() throws IOException, InterruptedException {
		readfile();
	}
	public static void readfile() throws   IOException, InterruptedException {
		File f = new File("");//global location
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		Thread.sleep(2000);
	}
}