import java.util.HashMap;

public class RomanToInteger {
    static int romanToInt(String s) {
        int result = 0 ;
        int length = s.length()-1;
        HashMap<Character, Integer> hash_values = new HashMap< Character, Integer >();
        hash_values.put('I',1);
        hash_values.put('V',5);
        hash_values.put('X',10);
        hash_values.put('L',50);
        hash_values.put('C',100);
        hash_values.put('D',500);
        hash_values.put('M',1000);

        if (s.length() == 1){   //private case
            result = hash_values.get(s.charAt(length));
            return result;
        }
        for (int i = s.length(); i >= 0 ; i--) {
            if (length == 0 ){    // private case to the last itera
                if (hash_values.get(s.charAt(0)) >= hash_values.get(s.charAt(1))) {
                    result += hash_values.get(s.charAt(0));
                }
                return result;
            }
                char tmp = s.charAt(length);          // the end char in the string
                char tmp2 = s.charAt(--length);     // next char in the string
                result += hash_values.get(tmp);
                if (hash_values.get(tmp2) < hash_values.get(tmp)) {
                    result -= hash_values.get(tmp2);
                    if (length > 0) {
                        length--;
                    }
                }
            }
        return result;
    }


    public static void main(String[] args) {
        String tmp = "MCMXCIV";
        System.out.println(romanToInt(tmp));
    }
}