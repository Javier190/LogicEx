class TwoSum {
//Ejercicio: Dado un arreglo de int. Buscar 2 numeros dentro del arreglo que sume el target Y devovler el indice de los 2 elementos.

    public static void main(String[] args) {
        System.out.println("Hello World Solution!");

        int target;
        target = 12;
        int[] nums = new int[4];

        nums[0] = 0;
        nums[1] = 4;
        nums[2] = 8;
        nums[3] = 6;

        twoSum(nums, target);
    }
    public static int[] twoSum(int[] nums, int target) {

        int[] numsFinal = new int[2];

        for (int i = 0; i < nums.length; i++){
            for (int y = i+1 ; y < nums.length; y++){
                if ((nums[i] + nums[y]) == target){
                    numsFinal[0] = i;
                    numsFinal[1] = y;
                    System.out.println("Indices " + numsFinal[0] + " y " + numsFinal[1] + " Suman el valor de: " + target );
                }
            }
        }
        return numsFinal;
    }

}