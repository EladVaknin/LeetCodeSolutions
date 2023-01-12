public class CheckifWordEqualsSummationofTwoWords {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        if (convert(targetWord) == convert(firstWord) + convert(secondWord))
            return true;
        return false;
    }

    public int convert (String s){
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            result = (s.charAt(i) - 'a') + result*10;
        }
        return result;
    }
}
