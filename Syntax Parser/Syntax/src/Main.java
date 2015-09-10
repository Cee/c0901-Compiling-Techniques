import java.io.File;
import java.io.IOException;

/**
 * Created by Cee on 11/5/14.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("program.txt");
        Lex lex = new Lex(file);
        lex.process();
        String stringForSyntax = lex.OutputForSyntax();
        Syntax syntax = new Syntax();
        syntax.process(stringForSyntax);
    }
}
