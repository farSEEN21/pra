import org.testng.Assert;
import org.testng.annotations.Test;

public class Sort {


    public static int check(int[] ar, int x) {

        sorting(ar); //using method for sorting array

        int l = 0, r = ar.length - 1; // searching number X in array using half of array
        while (l <= r) {
            int m = (l + r) / 2;
            if (ar[m] == x)
                return m;
            else if (ar[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }


        return -1;
    }


    public static int successively(int[] ar, int number) {
        sorting(ar);

        for (int i = 0; i <= ar.length - 1; i++) { //searching Number in array from begining
            if (ar[i] == number) return i;
        }
        return -1;

    }


    public static int[] sorting(int[] ar) {

        Boolean end = true; //bubble sorting
        int temp;
        while (end == false)
            end = false;
        for (int o = ar.length - 1; o >= 1; o--) {
            for (int i = 0; i < o; i++)
                if (ar[i] > ar[i + 1]) {
                    temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = temp;
                }


        }
//        for (temp = 0; temp < ar.length; temp++) {
//            System.out.println(ar[temp]);
//        }
//for (int x:ar) System.out.print(x+" ");
//        System.out.println();
//
        removiedouble(ar); // removing same numbers
        return ar;
    }


    public static int[] removiedouble(int[] ar) {

        int n = ar.length;

        for (int i = 0, m = 0; i != n; i++, n = m) {
            for (int j = m = i + 1; j != n; j++) {
                if (ar[j] != ar[i]) {
                    if (m != j) ar[m] = ar[j];
                    m++;
                }
            }
        }
        if (n != ar.length) {
            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = ar[i];

            ar = b;
        }

//        for (int x : ar) System.out.print(x + " ");
//        System.out.println();

        return ar;
    }


}
