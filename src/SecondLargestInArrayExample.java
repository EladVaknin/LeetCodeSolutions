import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestInArrayExample {
///////////////////////////regular solution  ///////////////////
    public static int getSecondLargest(int[] a, int size){
        int temp;
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (a[i] > a[j])
                {
//                   int c[] = {44, 66, 99, 77, 33, 22, 55};
                    System.out.println("a[i] =" +a[i]);
                    System.out.println("a[j] =" +a[j]);
                    System.out.println("aaaaaaaaaaaaaaa");
                    temp = a[i];
                    System.out.println("temp =" +temp);
                    System.out.println("bbbbbbbbbbbbb");
                    a[i] = a[j];
                    System.out.println("cccccccccccccc");
                    System.out.println("a[i] =" +a[i]);
                    System.out.println("a[j] =" +a[j]);
                    a[j] = temp;
                    System.out.println("a[j] =" +a[j]);
                    System.out.println("dddddddddddd");
                }
            }
        }
        return a[size-2];
    }

///////////////////////////////Arrays//////////////////////////

    public static int getSecondLargestArrays(int[] a, int size){
        Arrays.sort(a);
        return a[size-2];
    }




    ////////////////////////////Collections/////////////////////////////////
    public static int getSecondLargestCollections(Integer[] a, int size){
        List<Integer> list=Arrays.asList(a);
        Collections.sort(list);
        int element=list.get(size-2);
        return element;
    }



    public static void main(String args[]) {
        Integer a[] = {1, 2, 5, 6, 3, 2};
        Integer b[] = {44, 66, 99, 77, 33, 22, 55};
        int c[] = {44, 66, 99, 77, 33, 22, 55};
//        System.out.println("Second Largest: " + getSecondLargestCollections(a, 6));
//        System.out.println("Second Largest: " + getSecondLargestCollections(b, 7));
        System.out.println("Second Largest: " + getSecondLargest(c, 7));
    }
}
