public class AppendDeleteProblem {
    /**
     * @see <a href="https://www.hackerrank.com/challenges/append-and-delete/problem">
     * Link to Append and Delete Problem</a>
     */

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        String result = "No";
        if(k >= s.length() + t.length()){
            result = "Yes";
        }
        else{
            int maximalSubString = 0;
            int length = Integer.min(s.length(), t.length());
            for (int i = 0; i< length; i++){
                if(String.valueOf(s.charAt(i)).equals(String.valueOf(t.charAt(i)))){
                    maximalSubString ++;
                }
                else{
                    break;
                }
            }
            int minOperation = (s.length() - maximalSubString) + (t.length() - maximalSubString);
            if(k == minOperation || (k > minOperation && (k - minOperation) % 2 == 0)){
                result = "Yes";
            }
        }
        return result;
    }

    public static void main(String args[]){
        String s = "aaaaaaaaaa";
        String t = "aaaaa";
        int k = 7;
        System.out.println(appendAndDelete(s, t, k));
    }

}
