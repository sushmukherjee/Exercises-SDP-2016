package abstractfactory;

/**
 * Created by sush on 30/03/2016.
 */
public class NYOrderXMLParser implements XMLParser {
    @Override

    public String parse() {

        System.out.println("NYC Parsing order XML...");

        return "NYC Order XML Message";

    }


}
