import java.util.Arrays;

public class CheckIfTheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        char temp[] = sentence.toCharArray();
        int length =26;
        int temp2[] = new int [length];
        Arrays.sort(temp);
        boolean flag = false;
        int counter =0;
        for (int i = 0; i <temp.length ; i++) {
            if (temp[i] >= 'a' && temp[i] <= 'z') {
                int ind = temp[i] - 97;
                temp2[ind] = 1;
            }
        }
        for (int i = 0; i <temp2.length ; i++) {
            if (temp2[i] != 1){
                return false;
            }
        }
        return true;

    }
}
