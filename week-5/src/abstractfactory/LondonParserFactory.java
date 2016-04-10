package abstractfactory;

/**
 * Created by sush on 30/03/2016.
 */


public class LondonParserFactory implements AbstractParserFactory {



    public XMLParser getParserInstance(String parserType) {


        switch (parserType){
            case "LondonFEEDBACK":return new LondonFeedbackXMLParser();
            case "LondonORDER": return new LondonOrderXMLParser();

        }


        return null;

    }

}

