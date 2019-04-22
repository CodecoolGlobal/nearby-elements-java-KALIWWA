import java.util.ArrayList;
import java.util.List;

public class Elements {
    public static int[][] multi = new int[][]{
            { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
            { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
    };


    /* nearby (0,2,2)-->  2 0 1241 12
    * start = (y - range) > 0
    * end = (y + range) < array.length()*/
    public static int[] nearby(int listIndex, int elementIndex, int range) {
        List<Integer> resultList = new ArrayList<>(); // new list, because can add elements and don't have to set list size (not sure about this)
        int[] resultArray; // set place in memory for array

        for (int i = elementIndex - range; i <= elementIndex + range; i++) {
            if ((i != elementIndex) && (i >= 0) && (i < multi[listIndex].length) && (range > 0) && (elementIndex >= 0)) {
                resultList.add(multi[listIndex][i]);
            }
        }

        resultArray = new int[resultList.size()]; // new array of integers with resultList number of elements

        for (int j = 0; j < resultArray.length; j++) {
            resultArray[j] = resultList.get(j);
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[] result = nearby(0, 2, 2);
//        int[] result = nearby(1, 0, 1);
//        int[] result = nearby(1, 3, 5);
        for (int element : result) {
            System.out.print(element + " ");
        }


    }
}