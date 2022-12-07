import java.util.ArrayList;
import java.util.Arrays;

public class SingleNumberII {
    public int singleNumber(int[] nums) {
        // i check 3 numbers after sorting
        Arrays.sort(nums);
        if(nums.length == 0 ) return 0;
        for(int i = 0; i < nums.length-2; i++ ){
            if(nums[i] != nums[i+1] || nums[i] != nums[i+2]){
                return nums[i];
            }else{
                i += 2;;
            }
        }
        return nums[nums.length-1];
    }
}
