import java.util.stream.IntStream;

public class SherlockAndSquaresProblem {

    /**
     * @see <a href="https://www.hackerrank.com/challenges/sherlock-and-squares/problem">
     * Link to Sherlock and Squares Problem</a>
     */

    // Complete the squares function below.
    static int squaresSolutionOne(int a, int b) {
        int count = 0;
        int initialPos = ((Double)Math.sqrt(a)).intValue();
        int finalPos = ((Double)Math.sqrt(b)).intValue();
        for (int i = initialPos; i <= finalPos; i++){
            int square = i * i;
            if(square >= a && square <= b){
                count++;
            }
        }
        return count;
    }

    static int squaresSolutionTwo(int a, int b) {
        int initialPos = ((Double)Math.sqrt(a)).intValue();
        int finalPos = ((Double)Math.sqrt(b)).intValue();
        Long count = IntStream.rangeClosed(initialPos, finalPos)
                .map(i -> i*i)
                .filter(square -> square >= a && square <= b)
                .count();

        return count.intValue();

    }

    public static void main (String[] args){
        System.out.println(squaresSolutionTwo(3, 9));
    }
}
