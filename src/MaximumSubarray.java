public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum =0;
        int max = -Integer.MAX_VALUE;
        int s ,e = 1;
        for (int i = 0; i <nums.length ; i++) {
            sum += nums[i];
            if (sum > max){
                max = sum;
                e=i;
            }
            if(sum<0){
                sum =0;
                s =i+1;
            }
        }
        return max;
    }
}
