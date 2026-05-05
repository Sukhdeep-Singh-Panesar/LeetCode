import java.util.Arrays;

public class Problem1 {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
       throw new IllegalArgumentException("No sum found in the given array");
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{1, 3, 5, 2}, 6);
        System.out.println(Arrays.toString(result));
    }
}
