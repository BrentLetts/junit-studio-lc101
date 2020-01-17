package main;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     */
//    public static int binarySearch(int[] sortedNumbers, int n) {
//        //returns the index of n if it's present in sortedNumbers[],
//        //else returns -1
//        int left = 0;
//        int right = sortedNumbers.length -1;
//
//        while(left <= right){
//            int mid = left + (right - left) / 2;
//
//            //Check if x is present at mid
//            if(sortedNumbers[mid] == n){
//                return mid;
//            }
//
//            //If n is greater, ignore left half
//            if(sortedNumbers[mid] < n){
//                left = mid + 1;
//            }
//            //if n is smaller, ignore right half
//            else{
//                right = mid - 1;
//            }
//        }
//
//        //if we reach here, then element was not present
//        return -1;
//    }

    public static int binarySearch(int[] sortedNumbers, int n) {
        int right = sortedNumbers.length - 1;
        int left = 0;
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (sortedNumbers[mid] > n) {
                right = mid - 1;
            } else if (sortedNumbers[mid] < n) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BonusBinarySearch ob = new BonusBinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 2;
        int result = binarySearch(arr, x);
        if(result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }

}
