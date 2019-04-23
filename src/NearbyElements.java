import java.util.ArrayList;
import java.util.List;

public class NearbyElements {

    private int[][] multi = new int[][]{
            {2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323},
            {1, 3, 5, 7},
            {321, 320, 32, 3, 41241, -11, -12, -13, -66, -688}
    };

    public Result nearby(int listIndex, int elementIndex, int range) {

        if (range >= 0) {
            // new list, because can add elements and don't have to set list size
            List<Integer> resultList = new ArrayList<>();
            // set place in memory for array
            int[] resultArray;


            // startPoint has to be minimum 1st element
            int startPoint = elementIndex - range;
            if (startPoint < 0) {
                startPoint = 0;
            }

            // endPoint has to be minimum last element
            int endPoint = elementIndex + range;
            if (endPoint >= multi[listIndex].length) {
                endPoint = multi[listIndex].length - 1;
            }


            for (int i = startPoint; i <= endPoint; i++) {
                if (i != elementIndex) {
                    resultList.add(multi[listIndex][i]);
                }
            }

            // new array of integers with resultList number of elements
            resultArray = new int[resultList.size()];

            for (int j = 0; j < resultArray.length; j++) {
                resultArray[j] = resultList.get(j);
            }

            return new Result(resultArray);
        }
        return null;
    }

}
