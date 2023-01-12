public class DecodeXORedArray {
    public int[] decode(int[] encoded, int first) {
        int size = encoded.length;
        int result [] = new int [size+1];
        result [0] = first;
        int temp =0;
        for (int i = 1; i <= size ; i++) {
            temp = result[i-1]^encoded[i-1];
            result [i] = temp;

        }
        return result;
    }
}
