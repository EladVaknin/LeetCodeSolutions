public class ShuffleTheArray {
//    public static int[] shuffle(int[] nums, int n) {
//
//        // simple solution
//        int firstHalf [] = new int[n];
//        int secondtHalf [] = new int[n];
//        int result [] =new int[nums.length];
//
//        // insert
//        for (int i = 0; i <n ; i++) {
//            firstHalf[i] = nums [i];
//        }
//        for (int i = n; i <nums.length ; i++) {
//            secondtHalf[i] = nums [i];
//        }
//
//
//
//        for (int i = 0; i <result.length-1 ; i++) {
//            result[i] = firstHalf[i];
//            result[i+1] =secondtHalf[i];
//        }
//
//        for (int i = 0; i <result.length ; i++) {
//            System.out.println(result[i]);
//        }
//
//        return result;
//
//    }
    public static int[] shuffle(int[] nums, int n) {
        //{1,2,3,4,4,3,2,1};   // -> 1,4,2,3,3,2,4,1
        for (int i = 1; i <nums.length-1; i++) {
            int tmp = nums[i];
            if (i%2 != 0){
                nums[i] =nums[n];
                n++;
                int tmp2 = nums[i];
            }
                nums[i+1] = tmp;
//            if (nums[i]%2 == 0 && i<nums.length){
//                nums[i]=nums[n];
//                n++;
//            }
        }

        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);
        }


        return nums;
    }




    /// in one for i need to do it

    public static void main(String[] args) {
        int arr [] ={1,2,3,4,4,3,2,1};   // -> 1,4,2,3,3,2,4,1
        int n = 4;
        System.out.println(shuffle(arr,n));
        System.out.println(0%2);


    }
}
