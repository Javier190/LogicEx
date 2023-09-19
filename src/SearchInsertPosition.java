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
        searchInsertPosition.searchInsert(nums, 5);
        searchInsertPosition.searchInsert(nums, 2);
        searchInsertPosition.searchInsert(nums, 4);
        searchInsertPosition.searchInsert(nums, 7);
    }


    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}



