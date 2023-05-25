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
        int[] numsTransition = new int[8];

            for (int y = 0; y < nums.length; y++) {
                if (val != nums[y]) {
                    int temp = nums[k];
                    nums[k] = nums[y];
                    nums[y] = temp;
                    k++;
                }
            }
        return k;
    }
}
