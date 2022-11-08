public class SumOfAllOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0 ;
        int size = arr.length;
        for (int i = 0; i <size ; i++) {
            for (int j = i; j <size ; j +=2) {
                for (int k = i; k <= j ; k++) {
                    sum = sum +arr[k];
                }
            }
        }
        return sum;
    }
}
