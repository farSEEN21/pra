import org.testng.annotations.Test;

public class Sort {


    public static int check(int[] ar, int x) {

        sorting(ar);

        int l = 0, r = ar.length - 1;

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

        for (int i = 0; i <= ar.length - 1; i++) {
            if (ar[i] == number) return i;
        }
        return -1;

    }




    public static int[] sorting(int[] ar) {
        Boolean end = true;
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
        for (temp=0;temp<ar.length;temp++){
            System.out.println(ar[temp]);
        }
        return ar;
    }


}
