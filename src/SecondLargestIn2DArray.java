public class SecondLargestIn2DArray {

    public static int getSecondLargestIn2D(int[][] a){
        int row = a[0].length;
        int column = a.length;
        int result = 0;
        int max = 1;

        ////// find the max
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <column ; j++) {
                if(a[i][j]>max){
                    max = a[i][j];
                }
            }
        }
////////////////// find the second max = the result in range between the current value and the max
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <column ; j++) {
                if (a[i][j]>result && a[i][j]<max){       //check the range - only one case will not establish the condition and this is the result
                    result = a[i][j];
                }
            }
        }

    return result;
    }


    public static void main(String[] args) {
        int[][] a = {{1, 3, 4}, {8, 9, 0}, {5, 7, 3}};
        System.out.println("the result is = "+getSecondLargestIn2D(a));
    }
}
