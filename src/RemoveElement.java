public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int amswer = 0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] != val) {
                nums[amswer]=nums[i];
                amswer++;
            }
        }
//        for (int i = 0; i <amswer ; i++) {
//            System.out.println(nums[i]);
//        }
        return amswer;
    }

    public static void main(String[] args) {
        int []arr  = {3,2,2,3};
        System.out.println();
        System.out.println(removeElement(arr,3));
    }
}
