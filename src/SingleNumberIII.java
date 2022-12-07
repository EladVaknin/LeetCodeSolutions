import java.util.Arrays;

public class SingleNumberIII {
    public static int[] singleNumber(int[] nums) {
    // i check pairs numbers after sorting
        Arrays.sort(nums);
        int result [] = new int [2];
        for(int i = 0; i < nums.length-1; i++ ){
        if(nums[i] != nums[i+1]){
             result[0]=nums[i];
             result[1]=nums[i+1];
             break;
        }else{
            i += 1;;
        }
    }
        for (int i = 0; i <result.length ; i++) {
            System.out.println(result[i]);
        }
        return result;
    }


    public static void main(String[] args) {
        int arr [] = {1,2,1,3,5};
        int arr2 [] = {0,1,1,2};
        int arr3 [] = {1,1,2,3,4,4};
        //Without the edge cases where the numbers are at the ends of the array
        System.out.println(singleNumber(arr2));
    }
}
