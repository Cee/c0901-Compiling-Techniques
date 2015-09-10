import java.util.ArrayList;

/**
 * Created by Cee on 11/21/14.
 */
public class PPT {
    public ArrayList<PPTElement> pptElements = new ArrayList<PPTElement>();

    public PPT(){

        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("FuncBlock");
        pptElements.add(new PPTElement("Program", "void", arrayList1));

        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("FuncBlock");
        pptElements.add(new PPTElement("Program", "int", arrayList2));

        ArrayList<String> arrayList3 = new ArrayList<String>();
        arrayList3.add("FuncBlock");
        pptElements.add(new PPTElement("Program", "double", arrayList3));

        ArrayList<String> arrayList4 = new ArrayList<String>();
        arrayList4.add("rightbrace");
        arrayList4.add("Statements");
        arrayList4.add("leftbrace");
        arrayList4.add("rightparen");
        arrayList4.add("Paras");
        arrayList4.add("leftparen");
        arrayList4.add("FuncName");
        arrayList4.add("void");
        pptElements.add(new PPTElement("FuncBlock", "void", arrayList4));

        ArrayList<String> arrayList5 = new ArrayList<String>();
        arrayList5.add("rightbrace");
        arrayList5.add("ReturnClause");
        arrayList5.add("Statements");
        arrayList5.add("leftbrace");
        arrayList5.add("rightparen");
        arrayList5.add("Paras");
        arrayList5.add("leftparen");
        arrayList5.add("FuncName");
        arrayList5.add("DataType");
        pptElements.add(new PPTElement("FuncBlock", "int", arrayList5));

        ArrayList<String> arrayList6 = new ArrayList<String>();
        arrayList6.add("rightbrace");
        arrayList6.add("ReturnClause");
        arrayList6.add("Statements");
        arrayList6.add("leftbrace");
        arrayList6.add("rightparen");
        arrayList6.add("Paras");
        arrayList6.add("leftparen");
        arrayList6.add("FuncName");
        arrayList6.add("DataType");
        pptElements.add(new PPTElement("FuncBlock", "double", arrayList6));

        ArrayList<String> arrayList7 = new ArrayList<String>();
        arrayList7.add("int");
        pptElements.add(new PPTElement("DataType", "int", arrayList7));

        ArrayList<String> arrayList8 = new ArrayList<String>();
        arrayList8.add("double");
        pptElements.add(new PPTElement("DataType", "double", arrayList8));

        ArrayList<String> arrayList9 = new ArrayList<String>();
        arrayList9.add("id");
        pptElements.add(new PPTElement("FuncName", "id", arrayList9));

        ArrayList<String> arrayList10 = new ArrayList<String>();
        arrayList10.add("Para");
        pptElements.add(new PPTElement("Paras", "int", arrayList10));

        ArrayList<String> arrayList11 = new ArrayList<String>();
        arrayList11.add("Para");
        pptElements.add(new PPTElement("Paras", "double", arrayList11));

        ArrayList<String> arrayList12 = new ArrayList<String>();
        arrayList12.add("id");
        arrayList12.add("DataType");
        pptElements.add(new PPTElement("Para", "int", arrayList12));

        ArrayList<String> arrayList13 = new ArrayList<String>();
        arrayList13.add("id");
        arrayList13.add("DataType");
        pptElements.add(new PPTElement("Para", "double", arrayList13));

        ArrayList<String> arrayList14 = new ArrayList<String>();
//        arrayList14.add("Statements");
//        arrayList14.add("semicolon");
        arrayList14.add("S");
        pptElements.add(new PPTElement("Statements", "int", arrayList14));

        ArrayList<String> arrayList15 = new ArrayList<String>();
//        arrayList15.add("Statements");
//        arrayList15.add("semicolon");
        arrayList15.add("S");
        pptElements.add(new PPTElement("Statements", "double", arrayList15));

        ArrayList<String> arrayList16 = new ArrayList<String>();
//        arrayList16.add("Statements");
//        arrayList16.add("semicolon");
        arrayList16.add("S");
        pptElements.add(new PPTElement("Statements", "id", arrayList16));

        ArrayList<String> arrayList17 = new ArrayList<String>();
        arrayList17.add("semicolon");
        arrayList17.add("num");
        arrayList17.add("assignop");
        arrayList17.add("id");
        pptElements.add(new PPTElement("PickValue", "id", arrayList17));

        ArrayList<String> arrayList18 = new ArrayList<String>();
        arrayList18.add("Keyword");
        arrayList18.add("CompareOp");
        arrayList18.add("Keyword");
        pptElements.add(new PPTElement("Condition", "id", arrayList18));

        ArrayList<String> arrayList19 = new ArrayList<String>();
        arrayList19.add("Keyword");
        arrayList19.add("CompareOp");
        arrayList19.add("Keyword");
        pptElements.add(new PPTElement("Condition", "num", arrayList19));

        ArrayList<String> arrayList20 = new ArrayList<String>();
        arrayList20.add("S");
        pptElements.add(new PPTElement("Block", "int", arrayList20));

        ArrayList<String> arrayList21 = new ArrayList<String>();
        arrayList21.add("S");
        pptElements.add(new PPTElement("Block", "double", arrayList21));

        ArrayList<String> arrayList22 = new ArrayList<String>();
        arrayList22.add("S");
        pptElements.add(new PPTElement("Block", "id", arrayList22));

        ArrayList<String> arrayList23 = new ArrayList<String>();
        arrayList23.add("PickValue");
        arrayList23.add("DataType");
        pptElements.add(new PPTElement("S", "int", arrayList23));

        ArrayList<String> arrayList24 = new ArrayList<String>();
        arrayList24.add("PickValue");
        arrayList24.add("DataType");
        pptElements.add(new PPTElement("S", "double", arrayList24));

        ArrayList<String> arrayList25 = new ArrayList<String>();
        arrayList25.add("PickValue");
        pptElements.add(new PPTElement("S", "id", arrayList25));

        ArrayList<String> arrayList26 = new ArrayList<String>();
        arrayList26.add("id");
        pptElements.add(new PPTElement("Keyword", "id", arrayList26));

        ArrayList<String> arrayList27 = new ArrayList<String>();
        arrayList27.add("num");
        pptElements.add(new PPTElement("Keyword", "num", arrayList27));

        ArrayList<String> arrayList28 = new ArrayList<String>();
//        arrayList28.add("Statements");
//        arrayList28.add("semicolon");
        arrayList28.add("S");
        pptElements.add(new PPTElement("Statements", "if", arrayList28));

        ArrayList<String> arrayList29 = new ArrayList<String>();
//        arrayList29.add("Statements");
//        arrayList29.add("semicolon");
        arrayList29.add("S");
        pptElements.add(new PPTElement("Statements", "while", arrayList29));

        ArrayList<String> arrayList30 = new ArrayList<String>();
        arrayList30.add("S");
        pptElements.add(new PPTElement("Block", "if", arrayList30));

        ArrayList<String> arrayList31 = new ArrayList<String>();
        arrayList31.add("S");
        pptElements.add(new PPTElement("Block", "while", arrayList31));

        ArrayList<String> arrayList32 = new ArrayList<String>();
        arrayList32.add("Block");
        arrayList32.add("rightparen");
        arrayList32.add("Condition");
        arrayList32.add("leftparen");
        arrayList32.add("if");
        pptElements.add(new PPTElement("S", "if", arrayList32));

        ArrayList<String> arrayList33 = new ArrayList<String>();
        arrayList33.add("Block");
        arrayList33.add("rightparen");
        arrayList33.add("Condition");
        arrayList33.add("leftparen");
        arrayList33.add("while");
        pptElements.add(new PPTElement("S", "while", arrayList33));

        ArrayList<String> arrayList34 = new ArrayList<String>();
        arrayList34.add("semicolon");
        arrayList34.add("Keyword");
        arrayList34.add("return");
        pptElements.add(new PPTElement("ReturnClause", "return", arrayList34));

        ArrayList<String> arrayList35 = new ArrayList<String>();
        arrayList35.add("less");
        pptElements.add(new PPTElement("CompareOp", "less", arrayList35));

        ArrayList<String> arrayList36 = new ArrayList<String>();
        arrayList36.add("lessorequal");
        pptElements.add(new PPTElement("CompareOp", "lessorequal", arrayList36));

        ArrayList<String> arrayList37 = new ArrayList<String>();
        arrayList37.add("greater");
        pptElements.add(new PPTElement("CompareOp", "greater", arrayList37));

        ArrayList<String> arrayList38 = new ArrayList<String>();
        arrayList38.add("greaterofequal");
        pptElements.add(new PPTElement("CompareOp", "greaterofequal", arrayList38));

        ArrayList<String> arrayList39 = new ArrayList<String>();
        arrayList39.add("equal");
        pptElements.add(new PPTElement("CompareOp", "equal", arrayList39));

        ArrayList<String> arrayList40 = new ArrayList<String>();
        arrayList40.add("notequal");
        pptElements.add(new PPTElement("CompareOp", "notequal", arrayList40));

        ArrayList<String> arrayList41 = new ArrayList<String>();
        pptElements.add(new PPTElement("Program", "$", arrayList41));

        ArrayList<String> arrayList42 = new ArrayList<String>();
        pptElements.add(new PPTElement("FuncBlock", "$", arrayList42));

        ArrayList<String> arrayList43 = new ArrayList<String>();
        pptElements.add(new PPTElement("Paras", "rightbrace", arrayList43));

        ArrayList<String> arrayList44 = new ArrayList<String>();
        pptElements.add(new PPTElement("Statements", "rightbrace", arrayList44));

        ArrayList<String> arrayList45 = new ArrayList<String>();
        arrayList45.add("rightbrace");
        arrayList45.add("Statements");
        arrayList45.add("leftbrace");
        pptElements.add(new PPTElement("Block", "leftbrace", arrayList45));

    }

    public boolean inTable(String nonterm, String inputSymbol){
        for (PPTElement item : pptElements) {
            if (nonterm.equals(item.nonTerm) && inputSymbol.equals(item.inputSymbol)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> getProductions(String nonterm, String inputSymbol){
        for (PPTElement item : pptElements){
            if (nonterm.equals(item.nonTerm) && inputSymbol.equals(item.inputSymbol)){
//                System.out.println(pptElements.indexOf(item) + 1);
                return item.productions;
            }
        }
        return null;
    }
}
