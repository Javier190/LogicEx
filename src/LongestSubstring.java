public class LongestSubstring {


    public static void main(String[] args) {
        System.out.println("Hello Longest Preffix String!");

        LongestSubstring longestSubstring = new LongestSubstring();
        longestSubstring.lengthOfLongestSubstring("abcabccc");
    }


        public int lengthOfLongestSubstring(String s) {

        String finalSubstring;

        for (int i = 0; i <= s.length()  ; i++){

            String currentSubst = "";


            //El primer indice que recorra y haga un substring que se agranda HASTA que encuentre uno que se repita.
                //Creo que deberia agregar un arreglo de chars que agreguen las palabras nuevas?.
            //Y se guarda en un objeto current.
            //Despues sigue el indice y vuelve a crear el substring hasta que encuentre uno que se repita.
            //Si encuentra otro...haces un IF del que tenga mayor longitud sea el final.


        }

            return 0;
        }
}
