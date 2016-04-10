package strategy;

/**
 * Created by sush on 30/03/2016.
 */
public class CapTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {

        System.out.println(text.toUpperCase());
    }
}