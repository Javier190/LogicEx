import java.util.*;

public class RemoveValFromArr {

    public static void main(String[] args) {
        System.out.println("Hello Valid RemoveValFromArr!");

        int[] nums = new int[4];

        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 2;

    RemoveValFromArr removeValFromArr = new RemoveValFromArr();
    removeValFromArr.removeElement(nums, 3);

    }

    public int removeElement(int[] nums, int val) {

        int k = 0;
        int[] numsTransition = new int[4];

        //Iterator<Integer> iteratorNum = Arrays.stream(nums).iterator();
            //Aqui voy eliminando o dejando en 0 el val que es 3 en este caso
            for (int y = 0; y < nums.length; y++) {
                if (val == nums[y]) {
                    nums[y] = 0;
                } else {
                    numsTransition[y] = nums[y];
                    k++;
                }
                //System.out.println("Valor final de lista:" + nums[y]);
            }
            //Ahora tengo que moverlos hacia adelante.
        //Podria crear una lista intermedia arriba y luego volver a asignar la nums.

        return k;
    }
}
