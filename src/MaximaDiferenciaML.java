public class MaximaDiferenciaML {

    public static int maximaDiferencia(int[] a) {
        if (a == null || a.length < 2) {
            return -1; // No se puede calcular la máxima diferencia
        }

        int maxDiff = 0;            //Integer.MIN_VALUE
        int minElement = a[0];

        for (int i = 1; i < a.length; i++) {
            int diff = a[i] - minElement;
            if (diff > maxDiff) {
                maxDiff = diff;
            }
            //ademas, si el elemento actual es menor que minElement, se actualiza minElement. para buscar la mayor diferencia.
            if (a[i] < minElement) {
                minElement = a[i];
            }
        }

        if (maxDiff == 0) {     //Integer.MIN_VALUE
            return -1; // No se puede calcular la máxima diferencia
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 9, 2};
        int maxDifference = maximaDiferencia(array);
        System.out.println("Máxima diferencia: " + maxDifference);
    }
}
