public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        String result = "";
        int size = indices.length;
        int stringSize =s.length();
        char arr [] = new char [size];
        for (int i = 0; i <stringSize ; i++) {
            int temp = indices[i];
            arr [temp] = s.charAt(i);
        }
        for (int i = 0; i <arr.length ; i++) {
            result += arr [i];
        }
        return result;
    }

}
