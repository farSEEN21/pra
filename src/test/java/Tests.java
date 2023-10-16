import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class Tests extends Sort {

    @Test
    public void Test1() {
        int x = 44000, z = 3;
        int[] ar = new int[x];
        for (int i = 0; i < x; i++) {
            ar[i] = i;
        }
        int t = (int) System.nanoTime();
        Sort sor = new Sort();
        int t1 = (int) System.nanoTime();

        int res = sor.check(ar, z);
        if (res == -1 || z == -1) {
            System.out.println("There is no " + z);
        } else {
            System.out.println(res + " Index for that number " + z +" "+ t + " " + t1 + "Res " + (t1 - t));
        }
        Assert.assertEquals(res, z);
    }

    @Test
     public void TestSucces() {
        int x = 52, z = 1;
        Random random=new Random();
        x= (int)(Math.random()*10);
        System.out.println(x);
        int[] ar = new int[x + 1];
        for (int i = 0; i <= x; i++) {
            ar[i] = random.nextInt(99); ;
                 }

        int t = (int) System.nanoTime();
        Sort sor = new Sort();
        int t1 = (int) System.nanoTime();
        int res = sor.successively(ar, z);
        if (res == -1) {
            System.out.println("There is no " + z);
        } else {
            System.out.println(res + " Index for that number " + z + " " + t + " " + t1 + " Res " + (t1 - t));
        }
        Assert.assertEquals(res, z);
    }


}
