import java.util.HashMap;
import java.util.Map;

public class PermutationEquationProblem {
    /**
 *  @see <a href="https://www.hackerrank.com/challenges/permutation-equation/problem">
 ink to Permutation Equation Problem</a>
 */

    //O(n)
    static int[] permutationEquationSolution1(int[] p) {
        Map<Integer, Integer> positions = new HashMap<>();
        int[] result = new int[p.length];
        for (int i = 0; i < p.length; i++){
            positions.put(p[i], i+1);
        }
        for (int i = 1; i <= positions.size(); i++){
            result[i-1] = positions.get(positions.get(i));
        }
        return result;
    }

    //O(n)
    static int[] permutationEquationSolution2(int[] p) {
        int[] result = new int[p.length];
        for (int i = 1; i <= p.length; i++){
            result[get(p, get(p,i))-1] = i;
        }
        return result;
    }

    static int get(int[] array, int pos){
        return array[pos -1];
    }

    public static void main(String arg[]){
        int[] p = new int[]{5, 2, 1, 3, 4};
        //int[] p = new int[]{2, 3, 1};
        int[] result = permutationEquationSolution1(p);
        //int[] result = permutationEquationSolution2(p);

        for (int i:
               result) {
            System.out.println(i);
        }
    }

}
