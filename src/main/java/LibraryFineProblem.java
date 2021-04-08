public class LibraryFineProblem {
    /**
     * @see <a href="https://www.hackerrank.com/challenges/library-fine/problem?h_r=next-challenge&h_v=zen">
     * Link to Library Fine Problem</a>
     * @param
     * @return
     */

    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine = 0;
        if(y1 > y2){
            fine = 10000;
        }
        else if(y1 == y2){
            if(m1 > m2){
                fine = (m1 - m2) * 500;
            }
            else if(m1 == m2 && d1 > d2){
                fine = (d1 - d2) * 15;
            }
        }
        return fine;
    }

    public static void main(String args[]){
        System.out.println(libraryFine(5,5,2014,23,2,2014));
    }
}
