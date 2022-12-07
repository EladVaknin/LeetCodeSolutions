import java.util.ArrayList;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        // implement with array that contains the number of occurrences of each number
        int length = nums.length;
        if (length ==1){
            return nums[0];
        }
        ArrayList <Integer> visited = new ArrayList<Integer>();
        int counter = 0;
        for (int i = 0; i <length ; i++) {
            if(visited.contains(nums[i])){
                visited.add(nums[i]);
                counter -=nums[i];
            }else {
                visited.add(nums[i]);
                counter +=nums[i];
            }
        }
        return counter;
    }
}
