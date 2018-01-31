import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class MyDefaultHandler extends DefaultHandler
{
	 int count;
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		int i;
		for(i=start;i<start+length;i++)
		{
         System.out.print(ch[i]);		
		}
		System.out.println();


	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("The no of elements read are "+count);
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.println("completed reading of "+qName);
	}

	@Override
	public void startDocument() throws SAXException 
	{       
		count=0;
		System.out.println("starting document Count: "+count);
		
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException
			{
		count++;
			
		System.out.println("starting element ");
		System.out.println(" element is "+qName);
	}
	
	

}
