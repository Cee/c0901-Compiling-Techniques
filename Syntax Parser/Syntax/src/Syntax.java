import java.util.*;

/**
 * Created by Cee on 11/21/14.
 */
public class Syntax {

    private String [] tokenImage =
            {"double", "if", "int", "return",
             "void", "while",
             "less", "lessorequal", "greater",
             "greaterofequal", "equal", "notequal",
             "assignop",
             "semicolon", "comma", "period", "leftparen",
             "rightparen", "leftbracket", "rightbracket",
             "leftbrace","rightbrace",
             "id", "num"};

    private ArrayList<String> tokenList = new ArrayList<String>();

    public void process(String s){

        init();

        ArrayList<String> tokens = modify(s);
        Stack<String> stack = new Stack<String>();
        PPT ppt = new PPT();

        stack.push("$");
        stack.push("Program");
        int pointer = 0;
        String peek = stack.peek();
        String token = tokens.get(pointer);
        int count = 0;
        System.out.printf("-------TAKE %d-------\n", count);
        System.out.printf("Stack: ");
        for (String item: stack){
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("Pointer: " + token);
        while (peek != "$"){
            count++;
            System.out.printf("-------TAKE %d-------\n", count);
            if (peek.equals(token) && isToken(peek)){
                stack.pop();
                pointer++;
                System.out.println("Match: " + token);
                System.out.printf("Stack: ");
                for (String item: stack){
                    System.out.print(item + " ");
                }
                System.out.println();
                token = tokens.get(pointer);
                System.out.println("Pointer: " + token);
            } else if (!peek.equals(token) && isToken(peek)){
                System.out.println("Pointer: " + token);
                System.out.println("Peek: " + peek);
                System.out.println("X is a terminal Error");
                break;
            } else if (!ppt.inTable(peek, token)){
                System.out.println("Empty entry Error");
                break;
            } else {
                ArrayList<String> pushToStack = ppt.getProductions(peek, token);
                stack.pop();
                System.out.printf("Stack: ");
                for (String item: stack){
                    System.out.print(item + " ");
                }
                System.out.println();
                System.out.println("Pointer: " + token);
                System.out.print("Output: ");
                for (String item: pushToStack){
                    System.out.print(item + " ");
                    stack.push(item);
                }
                System.out.println();
            }
            peek = stack.peek();
        }
        System.out.println("Complete!");
    }

    private boolean isToken(String s){
        if (tokenList.contains(s)) return true;
        return false;
    }

    private void init(){
        for (String s: tokenImage){
            tokenList.add(s);
        }
    }

    private ArrayList<String> modify(String s){
        String string = s.toLowerCase();
        String[] array = string.split(" ");
        ArrayList<String> ret = new ArrayList<String>();
        for (String item: array){
            ret.add(item);
        }
        int i = 1;
        while (i < ret.size()){
            if (ret.get(i).equals("id") && (ret.get(i - 1).equals("if") || ret.get(i - 1).equals("while"))){
                ret.remove(i);
            } else {
//                System.out.print(ret.get(i) + " ");
                i++;
            }
        }
//        System.out.println();
        return ret;
    }
}
