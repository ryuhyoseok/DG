package SimpleSocketServer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;
import java.util.Stack;


public class PubXMLGenerator {

	String xml;
	Random rand = new Random();
	Elements elements = new Elements();
	
	PubXMLGenerator() {		
		xml = "";
		//xml += "<?xml version=\"1.0\" standalone=\"yes\" ?>\n";
	}
	
	public void generate() {
		
		xml += elements.pubDocuments();
		// required
		xml += elements.document();
		
		/////////////////////////////////////////// User
		// required
		xml += elements.user(Constants.PROB_USER_PUB);
		
		/////////////////////////////   Classification
		// All Optional
		xml += elements.classification(Constants.PROB_CLASSIFICATION_PUB);
		
		//////////////////////////////////  Store
		// All Optional
		xml += elements.store(Constants.PROB_STORE_PUB);		
		
		////////////////////////////    ETC
		// AllOptional
		xml +=elements.etc(Constants.PROB_ETC_PUB);
		
		xml += "\t</Document>\n";
		xml += "</Documents>";
		

	}
	
	public void print() {
		System.out.println(xml);
	}
	
	public String returnXML() {
		return xml;
	}
	
	
	
	public static void main(String[] args) {
		
		PubXMLGenerator generator = new PubXMLGenerator();
		generator.generate();
		generator.print();
	}

}
