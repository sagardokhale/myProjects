import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;


public class parsernew {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SAXParserFactory factory=SAXParserFactory.newInstance();
			SAXParser p=factory.newSAXParser();
			p.parse(new File(".\\src\\book.xml"),new MyDefaultHandler());
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
