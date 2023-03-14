import java.util.ArrayList;
import java.util.Arrays;

class TataConsLogica {
//Ejercicio: Dado un numero cualqueira, retornar un int con los valores al reves, ej 123 y retorna 321.
    public static void main(String[] args) {
        System.out.println("Hello World Solution!");

        reverse(5346);
    }

    public static int reverse(int x) {

        String numbStr = String.valueOf(x);
        String [] numbStrArray;
        String [] numbStrArrayRev = new String[numbStr.length()];
        numbStrArray = numbStr.split("",numbStr.length());
        String revNum = "";

        for (int i = (numbStrArray.length-1); i >= 0 ; i--){
            numbStrArrayRev[i] = numbStrArray[i];
            revNum += numbStrArrayRev[i];
        }

        int finalReverse = Integer.parseInt(revNum);
        System.out.println("Valor al reves es: " + finalReverse);
        return finalReverse;
    }
}