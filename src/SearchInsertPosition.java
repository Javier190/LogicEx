import java.util.Arrays;
import java.util.stream.Stream;

public class SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println("Hello Search Insert Position");
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int [] nums = new int[4];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 6;

        //[1,3,5,6]

        searchInsertPosition.searchInsert(nums, 7);
    }


    public int searchInsert(int[] nums, int target) {

        String resultado = Arrays.toString(nums);
        int index = 0;
        boolean isNotFoundIndex = true;

            for (int i=0; i < nums.length; i++){

                if (nums[i] == target){
                    index = i;
                    System.out.println("Devuelve un " + index);
                } else {
                    if (!resultado.contains(Integer.toString(target)) && nums[i]>target && isNotFoundIndex){
                        nums[i] = target;
                        index = i;
                        isNotFoundIndex = false;
                        System.out.println("Index donde seria insertado: " + index);
                    }
                }
            }
        return index;
    }
}



