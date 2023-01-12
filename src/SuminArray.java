import java.lang.reflect.Array;
import java.util.Arrays;

public class SuminArray {
    // need to return the big even sum from the array
    public int SumIMArray (int arr [] , int n){
        int sum = 0;
        int length = arr.length;
        Arrays.sort(arr);
        while (n != 0){
            sum += arr[length];
            length --;
            n--;
            if (sum%2 ==0){
                return sum;
            }else {
                length--;
                sum +=arr[length];
            }
        }
        return sum;
    }
}
