import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;

public class PrintMissingElementInArray {
    public static void missingNumbers(Integer a[]) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : a) {
            set.add(num);

        }
      int n = a.length + 1;
        for (int i = 1; i <= a.length; i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
    }

}
    public static void main(String[] args) {
Integer[] a={1,2,3,4,5,9};
        missingNumbers(a);
    }
}
