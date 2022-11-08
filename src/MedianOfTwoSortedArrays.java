import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        int sumLength = nums1.length + nums2.length;
        int resultArr [] = new int[sumLength];

        for (int i = 0; i <nums1.length ; i++) {
            resultArr[i] = nums1[i];
        }
        int j = 0;
        for (int i = nums1.length; i <sumLength ; i++) {
            resultArr[i] =nums2[j];
            j++;
        }
        Arrays.sort(resultArr);
        if (resultArr.length%2 ==0) {
            int minHalf = resultArr[sumLength / 2 - 1];
            int maxHalf = resultArr[sumLength / 2];
            median = (double) (maxHalf + minHalf) / 2;
        }else{
            median = resultArr[sumLength/2];
        }
        return median;
    }

    public static void main(String[] args) {
        int arr1 [] ={1,3,8,9};
        int  arr2[] = {2};
        System.out.println(findMedianSortedArrays(arr1,arr2));

    }
}
