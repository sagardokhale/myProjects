package testJava;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OpenChromeWithFacebook {
	
	public static void main(String[] args) {
		Runtime runtime=Runtime.getRuntime();
		Logger logger=Logger.getLogger("Event Logger"); 
		String [] arr= {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe","http://www.facebook.com"};
		try {
			runtime.exec(arr);
		} catch (IOException e) {
			logger.log(Level.WARNING, "Exception Thrown", e);
		}
		
	}

}
