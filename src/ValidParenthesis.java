import java.util.Arrays;
import java.util.Iterator;

public class ValidParenthesis {

    public static void main(String[] args) {
        System.out.println("Hello Valid Parenthesis!");
        ValidParenthesis validParenthesis = new ValidParenthesis();
        validParenthesis.isValid("(}");
    }

    public boolean isValid(String s) {

        String [] separateString = s.split("");
        boolean result = false;

        for (int i=0; i < separateString.length; i++){

            switch(separateString[i]) {
                case "(":
                    if (separateString[i+1].equals(")")){
                        result = true;
                    } else {
                        result = false; //Aqui me falta se cae pq lee el ultimo curly brace tambien de este caso.
                    }
                    break;

                case "[":
                    System.out.println("caso 2 en " + i);
                    if (separateString[i+1].equals("]")){

                        result = true;
                    } else {
                        result = false;
                    }
                    break;

                case "{":
                    if (separateString[i+1].equals("}")){
                        result = true;
                    } else {
                        result = false;
                    }
                    break;

                default:
                    result = false;
            }



        }

        System.out.println("El final es" + result);
        return result;
    }
}
