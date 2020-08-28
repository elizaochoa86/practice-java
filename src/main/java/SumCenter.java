import java.util.List;
import java.util.Optional;

/**
 * Return the index such as left sum is equal to right sum
 * example: [1, 2, 3, 10, 4, 2]
 * return: index(3)
*/
public class SumCenter {
    //O(n2)
    public static Optional<Integer> sumCenterOptionOne(List<Integer> arr){
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i < arr.size(); i++) {
            leftSum = sum(arr.subList(0, i));
            rightSum = sum(arr.subList(i+1, arr.size()));

            if(leftSum == rightSum){
                return Optional.of(arr.get(i));
            }
        }
        return Optional.empty();
    }

    private static int sum(List<Integer> subArr){
        int sum = 0;
        for (int i = 0; i < subArr.size(); i++) {
            sum += subArr.get(i);
        }
        return sum;
    }

    public static Optional<Integer> sumCenterOptionTwo(List<Integer> arr){
        int leftSum = sum(arr.subList(0, arr.size() - 2));
        int rightSum = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i > 1; i--) {
            if(leftSum == rightSum){
                return Optional.of(arr.get(i));
            }
            rightSum += arr.get(i);
            leftSum -=  arr.get(i-1);
        }
        return Optional.empty();
    }


}
