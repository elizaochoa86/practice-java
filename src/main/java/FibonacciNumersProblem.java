import java.util.Arrays;

public class FibonacciNumersProblem {

    /**
     *  @see <a href="https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem?h_r=internal-search">
     * Link to Fibonacci Numbers Problem</a>
     *
     */

    public static int fibonacci(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


    public static void main(String args[]){

        System.out.println(fibonacci(3));
    }
}
