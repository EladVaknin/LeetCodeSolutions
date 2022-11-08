import java.util.Arrays;

public class mostWordsFound{



    public static int mostWordsFound(String[] sentences) {
        int counter = 0;
        for (int i = 0; i < sentences.length; i++) {
            int x = countWords(sentences[i]);
            if (x > counter) {
                counter = x;
            }
        }
        return counter;
    }

    public static int countWords(String sentence) {
        if (sentence.length() ==0){
            return  0;
        }
        int countEmptySpace = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                countEmptySpace++;
            }
        }
        return countEmptySpace + 1;
    }


    public static void main(String[] args) {
        String[] s = new String [] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println("the result =" + mostWordsFound(s));
    }
}
