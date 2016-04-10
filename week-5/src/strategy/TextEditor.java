package strategy;

/**
 * Created by sush on 30/03/2016.
 */
public class TextEditor {
    private TextFormatter formattedtxt;
    public TextEditor(TextFormatter formattedtxt){
        this.formattedtxt = formattedtxt;
    }

    public void publishText(String text){
        formattedtxt.format(text);

    }

}
