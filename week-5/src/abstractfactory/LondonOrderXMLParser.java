package abstractfactory;

/**
 * Created by sush on 30/03/2016.
 */
public class LondonOrderXMLParser implements XMLParser {
    @Override

    public String parse() {

        System.out.println("London Parsing order XML...");

        return "London Order XML Message";

    }


}
