public class BinarySearch {
    //Arrays must be sorted!!!
    //Recursive solution O(log n)
    public static boolean binarySearchRecursive(int[] array, int x){
        return binarySearchRecursive(array, x, 0, array.length - 1);
    }
    public static boolean binarySearchRecursive(int[] array, int x, int left, int right){
        if(left > right){
            return false;
        }
        // (left + right) / 2;
        int mid = left + ((right - left) / 2);//this statement prevents the overflow
        if(array[mid] == x){
            return true;
        }
        else if(x < array[mid]){
            return binarySearchRecursive(array, x, left, mid - 1);
        }
        else{
            return binarySearchRecursive(array, x, mid + 1, right);
        }
    }

    //Iterative solution O(log n)
    public static boolean binarySearchIterative(int[] array, int x){
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (array[mid] == x) {
                return true;
            } else if (x < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main (String[] args){
        int[] array = new int[]{1, 3, 4, 5, 13, 20, 25, 40, 42, 44, 46};
        System.out.println(binarySearchRecursive(array, 15));
        System.out.println(binarySearchIterative(array, 13));
    }

}
