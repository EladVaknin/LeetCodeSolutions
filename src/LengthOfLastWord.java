public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String temp [] = s.split(" ");
        int max =0;
        for (int i = 0; i <temp.length ; i++) {
            max = temp[temp.length-1].length();
        }
        return max;
    }
}
