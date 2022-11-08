public class SubtracttheProductandSumofDigitsofanInteger {
    public int subtractProductAndSum(int n) {
        int temp = n;
        int temp2=0;
        int sum1 =1;
        int sum2 =0;
        int result =0;
        while (temp != 0 ){
            temp2=temp%10;
            temp =temp/10;
            sum1 *= temp2;
            sum2 += temp2;
        }
        result = sum1 -sum2;
        return result;
    }
}
