package abstractfactory;



/**
 * Created by sush on 30/03/2016.
 */
public interface AbstractParserFactory {
    public XMLParser getParserInstance(String parserType);
}
