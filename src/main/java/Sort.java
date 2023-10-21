

public class Sort {


    public static int[] SearchingInHalfs(int[] UnsortingArray, int seachingNumber) {

        int[] sortArray = BubbleSorting(UnsortingArray); //using method for sorting array
        int[] result=new int[2];
        int l = 0, r = UnsortingArray.length - 1; // searching number X in array using half of array
        int counter = 0;
        while (l <= r) {

            int m = (l + r) / 2;
            if (sortArray[m] == seachingNumber){
                result[0] = m;
                counter++;
            result[1] = counter;
                System.out.println(result[1]+" 1");
            return result;}
            else if (sortArray[m] < seachingNumber) {
                l = m + 1;
                counter++;
                result[1]=counter;
                System.out.println(result[1]+" 2");
            } else {
                r = m - 1;
                counter++;
                result[1]=counter;
                System.out.println(result[1]+" 3");
            }
        }
        result[0]=-1;
        return result ;
    }


    public static int SearchingFromBeginning(int[] UnsortingArray, int seachingNumber) {
        int[] sortArray = BubbleSorting(UnsortingArray);

        for (int i = 0; i <= sortArray.length - 1; i++) { //searching Number in array from begining
            if (sortArray[i] == seachingNumber) return i;
        }
        return -1;
    }


    public static int[] BubbleSorting(int[] sortingArray) {
        int temp;
        for (int o = sortingArray.length - 1; o >= 1; o--) {
            for (int i = 0; i < o; i++)
                if (sortingArray[i] > sortingArray[i + 1]) {
                    temp = sortingArray[i];
                    sortingArray[i] = sortingArray[i + 1];
                    sortingArray[i + 1] = temp;
                }
        }
        return removedouble(sortingArray);   // removing same numbers
    }


    public static int[] removedouble(int[] sortArray) {
        int arrayLength = sortArray.length;
        for (int i = 0, m = 0; i != arrayLength; i++, arrayLength = m) {
            for (int j = m = i + 1; j != arrayLength; j++) {
                if (sortArray[j] != sortArray[i]) {
                    if (m != j) sortArray[m] = sortArray[j];
                    m++;
                }
            }
        }
        if (arrayLength != sortArray.length) {
            int[] tempArray = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++)
                tempArray[i] = sortArray[i];
            sortArray = tempArray;
        }
        return sortArray;
    }
}
