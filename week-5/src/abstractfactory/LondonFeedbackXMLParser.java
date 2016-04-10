package abstractfactory;

/**
 * Created by sush on 30/03/2016.
 */
public class LondonFeedbackXMLParser implements XMLParser {
    @Override

    public String parse() {

        System.out.println("London Parsing feedback XML...");

        return "London Feedback XML Message";

    }


}
