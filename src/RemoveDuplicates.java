import java.util.Arrays;

public class RemoveDuplicates {


    public static void main(String[] args) {
        System.out.println("Remove Duplicates");

//        int[] nums = new int[3];
//        nums[0] = 1;
//        nums[1] = 1;
//        nums[2] = 2;

        int[] nums = new int[10];
        nums[0] = 0;
        nums[1] = 0;
        nums[2] = 1;
        nums[3] = 1;
        nums[4] = 1;
        nums[5] = 2;
        nums[6] = 2;
        nums[7] = 3;
        nums[8] = 3;
        nums[9] = 4;

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        removeDuplicates.removeDuplicates(nums);
    }

    public int removeDuplicates(int[] nums) {


        int countK = 1;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] < nums[i+1]) {

                nums[countK] = nums[i+1];
                countK++;
            }
        }
        System.out.println(countK);
        return countK;
    }

        /* Solucion Larga y arriba la mas optimizada.
        int countK = 0;
        int[] numsK = new int[10];
        for (int i=0; i <= nums.length ; i++){
            if ((i+1) < nums.length){
                if (nums[i] != nums[i+1]) {
                    numsK[countK] = nums[i];
                    countK++;
                }
            } else {
                numsK[countK] = nums[i-1];
            }
        }
        int[] finalListNums = Arrays.stream(numsK)
                .filter(num -> num != 0)
                .toArray();

        return finalListNums.length;
    }
*/
}
