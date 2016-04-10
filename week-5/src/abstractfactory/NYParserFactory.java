package abstractfactory;

/**
 * Created by sush on 30/03/2016.
 */

public class NYParserFactory implements AbstractParserFactory {



public XMLParser getParserInstance(String parserType) {


        switch(parserType){



        case "NYFEEDBACK": return new NYFeedbackXMLParser ();

        case "NYCORDER": return new NYOrderXMLParser();



        }


        return null;

        }

        }
