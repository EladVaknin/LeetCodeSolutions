public class removeDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length ; i++) {
            if ( i < nums.length-1 && nums[i] == nums [i+1] ) {
                continue;
            }
                nums[counter] = nums[i];
                counter++;
        }

//        for (int i = 0; i <nums.length ; i++) {
//            System.out.println(nums[i]);
//        }
        return counter;
    }


    public static void main(String[] args) {
        int arr [] = {1,1,2};
        System.out.println(removeDuplicates(arr));

    }
}
