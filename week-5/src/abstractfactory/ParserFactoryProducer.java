package abstractfactory;

/**
 * Created by sush on 30/03/2016.
 */
public final class ParserFactoryProducer {


    private ParserFactoryProducer(){

        throw new AssertionError();

    }


    public static AbstractParserFactory getFactory(String factoryType){


        switch(factoryType)

        {

            case "NYCFactory": return new NYParserFactory();

            case "LondonFactory": return new LondonParserFactory();

        }

        return null;

    }

}
