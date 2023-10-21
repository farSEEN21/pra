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
        long t1 = System.nanoTime();

        int res = sor.SearchingInHalfs(ar, z);
        if (res == -1 || z == -1) {
            System.out.println("There is no " + z);
        } else {
            System.out.println(res + " Index for that number " + z + " " + t + " " + t1 + "Res " + (t1 - t));
        }
        Assert.assertEquals(res, z);
    }

    @Test
    public void TestSucces() {
        int x , z = 75;
        Random random = new Random(); // object of a random
        x = (int) (Math.random() * 1000);  //making random number for lenght of array
        System.out.println(x);
        int[] ar = new int[x + 1];
        for (int i = 0; i <= x; i++) // fill up array
        {
            ar[i] = random.nextInt(199);
            ;
        }

        int t = (int) System.nanoTime();
        Sort sor = new Sort(); //making object of a Sort class
        int t1 = (int) System.nanoTime();
        int res = sor.SearchingFromBeginning(ar, z);
        if (res == -1) {
            System.out.println("There is no " + z);
        } else {
            System.out.println(res + " Index for that number " + z + " " + t + " " + t1 + " Res " + (t1 - t));
        }
        Assert.assertEquals(res, z);
    }

@Test
public void TestSucces2() {
    int x, z = 75;
    Random random = new Random(); // object of a random
    x = (int) (Math.random() * 1000);  //making random number for lenght of array
    System.out.println(x);
    int[] ar = new int[x + 1];
    for (int i = 0; i <= x; i++) // fill up array
    {
        ar[i] = random.nextInt(199);
        ;
    }
    Sort sor = new Sort(); //making object of a Sort class
    ar = sor.BubbleSorting(ar);
    for (int f : ar) {
        System.out.println(f);
    }
}}