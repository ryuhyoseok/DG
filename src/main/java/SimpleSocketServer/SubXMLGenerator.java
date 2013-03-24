package SimpleSocketServer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;
import java.util.Stack;


public class SubXMLGenerator {

	String xml;
	Random rand = new Random();
	Elements elements = new Elements();
	
	SubXMLGenerator() {		
		xml = "";
		//xml += "<?xml version=\"1.0\" standalone=\"yes\" ?>\n";
	}
	
	public void generate() {
		
		xml += elements.subDocuments();
		// required
		xml += elements.document();
		
		/////////////////////////////////////////// User
		// required
		xml += elements.user(Constants.PROB_USER_SUB);
		
		/////////////////////////////   Classification
		// All Optional
		xml += elements.classification(Constants.PROB_CLASSIFICATION_SUB);
		
		//////////////////////////////////  Store
		// All Optional
		xml += elements.store(Constants.PROB_STORE_SUB);		
		
		xml += elements.publisher(Constants.PROB_PUBLISHER_SUB);
		
		////////////////////////////    ETC
		// AllOptional
		xml +=elements.etc(Constants.PROB_ETC_SUB);
		
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
		
		SubXMLGenerator generator = new SubXMLGenerator();
		generator.generate();
		generator.print();
	}

}
