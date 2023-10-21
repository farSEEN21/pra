import dto.ArrayDTO;
import dto.methodsForDTO;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class Tests extends Sort {

    @Test
    public void Test1() {
        int length = 1, Search_number = 0;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i;
        }
        Sort sor = new Sort();
        long timeBefore = System.nanoTime();
        int[] res = sor.SearchingInHalfs(array, Search_number);
        long timeAfter = System.nanoTime();
        if (res[0] == -1) {
            System.out.println("There is no " + Search_number + res[1]);
        } else {
            System.out.println(res[0] + " " + res[1]+  " Index for that number " + Search_number + " " + timeBefore + " " + timeAfter + " Res " + (timeAfter - timeBefore));
        }
        Assert.assertEquals(res[0], Search_number);
    }

    @Test
    public void TestSucces() {
        int length, Search_number = 75;
        Random random = new Random(); // object of a random
        length = (int) (Math.random() * 1000);  //making random number for lenght of array
        System.out.println(length);
        int[] array = new int[length + 1];
        for (int i = 0; i <= length; i++) // fill up array
        {
            array[i] = random.nextInt(199);

        }
        Sort sor = new Sort(); //making object of a Sort class
        int timeBefore = (int) System.nanoTime();
        int res = sor.SearchingFromBeginning(array, Search_number);
        int timeAfter = (int) System.nanoTime();
        if (res == -1) {
            System.out.println("There is no " + Search_number);
        } else {
            System.out.println(res + " Index for that number " + Search_number + " " + timeBefore + " " + timeAfter + " Res " + (timeAfter - timeBefore));
        }
        Assert.assertEquals(res, Search_number);
    }


    @Test (dataProvider  =  "DataArraylengthNumberTime",dataProviderClass = ArrayDTO.class)
public void Testttt(int length, int searchnumber,long t){
         int Search_number = searchnumber;

        System.out.println(length);
        int[] array = new int[length + 1];
        for (int i = 0; i <= length; i++) // fill up array
        {
            array[i] = new methodsForDTO().randomnumber();;

        }
        for (int x:array)
            System.out.println(x+ " length of array " + array.length+ "    Search_number "+ Search_number);
        Sort sor = new Sort(); //making object of a Sort class
        int timeBefore = (int) System.nanoTime();
        int res = sor.SearchingFromBeginning(array, Search_number);
        int timeAfter = (int) System.nanoTime();
        if (res == -1) {
            System.out.println("There is no " + searchnumber);
        } else {
            System.out.println(res + " Index for that number " + Search_number + " " + timeBefore + " " + timeAfter + " Res " + (timeAfter - timeBefore));
        }
        Assert.assertEquals(res, Search_number);
    }
    }




