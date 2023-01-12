import java.util.Arrays;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        System.out.println(length);
        if (length < 2){
            System.out.println(length);
            return nums[length];
        }else{
            System.out.println(length-3);
            return nums[length-3];
        }
    }

    public static void main(String[] args) {
        int arr [] = {3,2,1};
        System.out.println(thirdMax(arr));
    }
}
