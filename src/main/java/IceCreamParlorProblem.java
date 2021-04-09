import java.util.HashMap;
import java.util.Map;

public class IceCreamParlorProblem {
    /**
     * @see <a href="https://www.hackerrank.com/challenges/icecream-parlor/problem?h_r=internal-search&isFullScreen=true">
     * Link to Ice Cream Parlor Problem</a>
     * @param
     * @return
     */

    // Complete the icecreamParlor function below.
    static int[] icecreamParlor(int m, int[] arr) {
        Map<Integer, Integer> costPosition = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(costPosition.containsKey(m - arr[i])){
                return new int[]{costPosition.get(m - arr[i]) + 1, i + 1};
            }
            else{
                if(!costPosition.containsKey(arr[i])) {
                    costPosition.put(arr[i], i);
                }
            }
        }
        return null;
    }

    public static void main (String[] args){
        int[] cost = new int[]{1, 4, 5, 3, 2};
        int[] results = icecreamParlor(4, cost);
        for (int result:
             results) {
            System.out.println(result);
        }
    }
}
