import java.util.ArrayList;

/**
 * Created by Cee on 11/21/14.
 */
public class PPTElement {
    public String nonTerm;
    public String inputSymbol;
    public ArrayList<String> productions;
    public PPTElement(String nonTerm, String inputSymbol, ArrayList<String> productions){
        this.nonTerm = nonTerm;
        this.inputSymbol = inputSymbol;
        this.productions = productions;
    }
}
