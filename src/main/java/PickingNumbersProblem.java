import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PickingNumbersProblem {
    /*
     * Given an array of integers, find the longest subarray
     * where the absolute difference between any two elements is less than or equal to 1.

     *  @see <a href="https://www.hackerrank.com/challenges/picking-numbers/problem">Link to Picking Numbers Problem</a>

     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        Map<Integer, Long> repeated = a.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return repeated.keySet().stream()
                .map(key -> repeated.get(key) + repeated.getOrDefault(key+1, 0L))
                .map(Long::intValue)
                .max(Integer::compareTo)
                .orElse(0);

    }

    public static void main(String args[]){
        System.out.println(pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)));
    }
}
