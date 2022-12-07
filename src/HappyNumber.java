public class HappyNumber {  // just private cases - not complete
    public static boolean isHappy(int n) {
        if (n<0 ||(n >1 && n<10)){     // n positive number or 1<n<10;
            return false;
        }
        if (n == 1) {
            return true;
        }
        int sum = n;
        while (sum != 1){
            int unit = sum%10;
            System.out.println("units" + unit);
            int asarot = sum/10;
            System.out.println("asaraot" + asarot);
            sum = (int) ((int) Math.pow(asarot,2)+Math.pow(unit,2));
            System.out.println("sum" +sum);
            if (sum%10 ==0){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int check = 19 ;
        System.out.println(isHappy(check));
    }


}
