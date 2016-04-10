package abstractfactory;

/**
 * Created by sush on 30/03/2016.
 */
public class NYFeedbackXMLParser implements XMLParser {
    @Override

    public String parse() {

        System.out.println("NYC Parsing feedback XML...");

        return "NYC Feedback XML Message";

    }


}
