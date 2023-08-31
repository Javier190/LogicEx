import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println("Hello Preffix String!");

        String[] strs = {"flower","flow","flight"};

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        longestCommonPrefix.longestCommonPrefix(strs);

    }
    //Hay que recorrer primera palabra completa por caracter compararlo con la ultimo indice hasta que no tengan equals.
    public String longestCommonPrefix(String[] strs) {
        //Primero hay que ordenar el arreglo de Strings para luego comparar la primera y ultima palabra. Y sus caracteres.
        Arrays.sort(strs);
        String longestPrefix = "";
        String firstWord = strs[0];

            for (int x=0; x < firstWord.length(); x++){

                char charFirstWord = firstWord.charAt(x);
                char charAtLastWord = strs[(strs.length-1)].charAt(x);
                //Recorro y comparo cada caracter de la Primera y Ultima palabra hasta que no tengan similitud.
                if (charFirstWord == charAtLastWord){
                    longestPrefix += Character.toString(charFirstWord);
                    System.out.println("Prefijo mas largo: " + longestPrefix);
                } else {
                    //Aca devuelvo el prefijo mas largo hasa el momento, pero si no hay ninguno, devuelvo String vacio "".
                    if (longestPrefix.length() > 0){
                        System.out.println("lasldasd" + longestPrefix);
                        return longestPrefix;
                    } else {
                        System.out.println("Ejecucion Else Sin prefix");
                        return "";
                    }
                }
            }
        System.out.println("FINAL:" + longestPrefix);
        return longestPrefix;
    }
}
