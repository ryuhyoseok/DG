package SimpleSocketServer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Stack;

public class Elements {

	Random rand = new Random();
	RandomSelector selector = new RandomSelector();

	public String pubDocuments() {
		String xml = "";
		xml += "<Documents type =";
		xml += "\"publish\">\n";
		return xml;
	}

	public String subDocuments() {
		String xml = "";
		xml += "<Documents type =";
		xml += "\"subscribe\">\n";
		return xml;
	}

	public String document() {
		String xml = "";
		xml += "\t<Document>\n";
		return xml;
	}

	public String user(int[] probabilities) {
		String xml = "";

		xml += "\t\t<User>\n";

		// required
		if (selector.occurByProb(probabilities[0])) {
			xml += "\t\t\t<ID>";
			Integer id = rand.nextInt(10000);
			xml += id.toString();
			xml += "</ID>\n";
		}

		// required
		if (selector.occurByProb(probabilities[1])) {
			xml += "\t\t\t<Gender>";
			xml += selector.uniformDistribution(Constants.GENDERLIST);
			xml += "</Gender>\n";
		}

		// required
		if (selector.occurByProb(probabilities[2])) {
			xml += "\t\t\t<Age>";
			xml += selector.uniformDistribution(Constants.AGERANGELIST);
			xml += "</Age>\n";
		}

		xml += "\t\t</User>\n";

		return xml;
	}

	public String classification(int[] probabilities) {
		String xml = "";

		xml += "\t\t<Classification>\n";


		xml += "\t\t\t<Category>";
		String category = selector.uniformDistribution(Constants.CATEGORYLIST);
		xml += category;
		xml += "</Category>\n";

		if (selector.occurByProb(probabilities[1])) {
			xml += "\t\t\t<SubCategory>";

			if (category == "Food") {
				xml += selector.uniformDistribution(Constants.SUBCATEGORYLISTOFFOOD);
			} else if (category == "Fun") {
				xml += selector.uniformDistribution(Constants.SUBCATEGORYLISTOFFUN);
			}
			xml += "</SubCategory>\n";
		}

		xml += "\t\t</Classification>\n";

		return xml;
	}

	public String store(int[] probabilities) {
		String xml = "";

		xml += "\t\t<Store>\n";

		if (selector.occurByProb(probabilities[0])) {
		xml += "\t\t\t<Name>";
		xml += selector.uniformDistribution(Constants.STORENAMES);
		xml += "</Name>\n";
		}

		if (selector.occurByProb(probabilities[1])) {
		xml += "\t\t\t<PhoneNumber>";

		for (int i = 0; i < 7; i++) {
			Integer phone = rand.nextInt(10);
			xml += phone.toString();
		}

			xml += "</PhoneNumber>\n";
		}

		if (selector.occurByProb(probabilities[2])) {
			xml += "\t\t\t<Score>";
			Integer score = rand.nextInt(10) + 1;
			xml += score.toString();
			xml += "</Score>\n";
		}

		if (selector.occurByProb(probabilities[3])) {
			xml += "\t\t\t<WaitingTime>";
			Integer waiting = rand.nextInt(5) + 1;
			xml += waiting.toString();
			xml += "</WaitingTime>\n";
		}

		if (selector.occurByProb(probabilities[4])) {
			xml += "\t\t\t<PriceRange>";
			xml += rand.nextInt(5) + 1;
			xml += "</PriceRange>\n";
		}

		if (selector.occurByProb(probabilities[5])) {
			xml += "\t\t\t<ParkingArea>";
			xml += rand.nextBoolean();
			xml += "</ParkingArea>\n";
		}

		xml += "\t\t</Store>\n";

		return xml;

	}

	public String etc(int[] probabilities) {
		String xml = "";
		xml += "\t\t<ETC>\n";

		if (selector.occurByProb(probabilities[0])) {
			xml += "\t\t\t<PubTime>";
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");
			xml += format.format(calendar.getTime());
			xml += "</PubTime>\n";
		}

		if (selector.occurByProb(probabilities[1])) {
			xml += "\t\t\t<Comment>";
			xml += "</Comment>\n";
		}

		if (selector.occurByProb(probabilities[2])) {
			xml += "\t\t\t<Photo>";
			xml += rand.nextBoolean();
			xml += "</Photo>\n";
		}

		xml += "\t\t</ETC>\n";

		return xml;
	}
	
	public String publisher(int[] probabilities) {
		String xml = "";
		xml += "\t\t<Publisher>\n";

		// Optional
		if (selector.occurByProb(probabilities[0])) {
			xml += "\t\t\t<Gender>";
			xml += selector.uniformDistribution(Constants.GENDERLIST);
			xml += "</Gender>\n";
		}

		// Optional
		if (selector.occurByProb(probabilities[1])) {
			xml += "\t\t\t<Age>";
			xml += selector.uniformDistribution(Constants.AGERANGELIST);
			xml += "</Age>\n";
		}
		xml += "\t\t</Publisher>\n";
		return xml;
	}

}
