import java.util.LinkedList;
import java.util.List;

public class CircularArrayRotationProblem {
    /**
     * @see <a href="https://www.hackerrank.com/challenges/circular-array-rotation/problem">
     * Link to Circular Array Rotation Problem</a>
     */

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        List<Integer> temp = new LinkedList<>();
        for (int value:
             a) {
            temp.add(value);
        }

        for (int i = 1; i <= k; i ++){
            temp.add(0, temp.get(temp.size() - 1));
            temp.remove(temp.size() - 1);
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++){
            result[i] = temp.get(queries[i]);
        }

        return result;
    }

    public static void main(String[] args){
        int[] a = new int[]{3, 4, 5};
        int k = 2;
        int[] queries = new int[]{1, 2};
        int[] result = circularArrayRotation(a, k, queries);

        for (int i:
                result) {
            System.out.println(i);
        }
    }
}
