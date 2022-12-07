import java.util.Arrays;

public class PlusOne {

    //solution 1

//    public static int[] plusOne(int[] digits) {
//        StringBuilder stringBuilder = new StringBuilder();   //convert to string
//        for (int i = 0; i <digits.length ; i++) {
//            stringBuilder.append(digits[i]);
//        }
////        long num = Integer.parseInt(String.valueOf(stringBuilder));
//        long num = Long.parseLong(String.valueOf(stringBuilder));
//        System.out.println("bbbb"+num);
//        num +=1;  // add 1
//        System.out.println(num);
//        int length = digits.length;
//        if ((digits[length-1] == 9 && digits[0] == 9||((length ==1) &&(digits[length-1]==9)))) {   // check the size of the result array
//            length++;
//        }
//
//        int result [] = new int [length];
//
//
//        for (int i = length-1; i >= 0; i--) {   // insert the num
//            result [i] = (int)num%10;
//            num =num/10;
//        }
//        for (int i = 0; i <result.length ; i++) {
//            System.out.println(result[i]);
//        }
//        return result;
//
//    }

    //solution 2


    public static int[] plusOne(int[] digits) {

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int [n+1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {
        int digits [] = {4,3,2,1};
        int digits2 [] = {9};
        int digits3 [] = {9,9,9,9};
        int digits4 [] = {8,9,9,9};
        int digits5 [] = {3,4,9};
        int digits6 [] = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(plusOne(digits6));
    }
}
