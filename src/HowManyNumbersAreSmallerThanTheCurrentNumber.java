public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans [] =new int [nums.length];
        int counter=0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums.length ; j++) {
                if(nums [i] > nums [j]){
                    counter++ ;
                }
                ans[i] = counter;
            }
            counter =0 ;
        }
        return ans;

    }

}
