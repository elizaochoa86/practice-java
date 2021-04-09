public class FindDigitsProblem {
    /**
     * @see <a href="https://www.hackerrank.com/challenges/find-digits/problem">
     * Link to Find Digits Problem</a>
     * @param
     * @return
     */
    // Complete the findDigits function below.
    static int findDigits(int n) {
        String digits = String.valueOf(n);
        int count = 0;
        for (int i = 0; i<digits.length(); i++){
            int value = Integer.parseInt(String.valueOf(digits.charAt(i)));
            if(value != 0 && n % value == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(findDigits(10));
    }
}
