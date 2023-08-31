import java.util.Arrays;
import java.util.HashSet;

//tipicos DE PREGUNTAS

public class LongestSubstring {

    //Ejercicio Numero 3 de LeetCode

    public static void main(String[] args) {
        System.out.println("Hello Longest Preffix String!");

        LongestSubstring longestSubstring = new LongestSubstring();
        longestSubstring.lengthOfLongestSubstring("abcabccc");
        System.out.println(longestSubstring.lengthOfLongestSubstring("abcabccc"));
    }


        public int lengthOfLongestSubstring(String s) {

            int n = s.length();
            int maxLength = 0;
            int start = 0;
            int end = 0;
            HashSet<Character> set = new HashSet<>();

            while (start < n && end < n) {
                //Si no esta el char, se agrega
                if (!set.contains(s.charAt(end))) {
                    set.add(s.charAt(end));
                    end++;
                    maxLength = Math.max(maxLength, end - start);

                    //Si no esta, Se elimina.
                } else {
                    set.remove(s.charAt(start++));
                }
            }

            return maxLength;
        }
}


/*

 While se ejecutará mientras start sea menor que n y end sea menor que n. Esto garantiza que los punteros no se salgan de los límites de la cadena.
En cada iteración del bucle, se verifica si el carácter en la posición end de la cadena no está presente en el conjunto set, lo que indica que es un carácter único.
Si el carácter no está en el conjunto, se agrega a set, se incrementa end en 1 y se actualiza maxLength si es necesario (comparando la longitud actual del substring con maxLength).
Si el carácter está en el conjunto, significa que es un carácter repetido. En este caso, se debe eliminar el carácter en la posición start del conjunto set, incrementar start en 1 y avanzar al siguiente substring posible.
Al finalizar el bucle, se habrá encontrado el substring más largo sin caracteres repetidos, y maxLength contendrá su longitud.
Se devuelve maxLength, que representa la longitud del substring más largo sin caracteres repetidos.
En el bloque main, se crea una instancia de la clase LongestSubstring y se llama al método findLongestSubstring pasando la cadena "abcabccc". El resultado, que es la longitud del substring más largo sin caracteres repetidos, se almacena en la variable longestLength y se imprime en la consola.

Espero que esta explicación detallada te ayude a comprender mejor el código. Si tienes alguna otra pregunta, no dudes en preguntar.*/