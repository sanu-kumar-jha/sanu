package Sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    String bucketSortCars(String cars) {
        @SuppressWarnings("rawtypes")
        char[] carsChar = cars.toCharArray();
        HashSet carSet;
        Arrays.sort(carsChar);
        char[] carsCharDuplicatesRemoved = carsChar;
        int i=removeDuplicates(carsCharDuplicatesRemoved);
      //  System.out.println(Arrays.toString(carsChar));
        int count =0;
        for ( int j=0; j<i; j++ ) {
          if (carsCharDuplicatesRemoved[j]==carsChar) {
            
          }
        }
      //Write your code here
        return cars;

   }

   static int removeDuplicates(char[] arr) {
    int i = 0;
    for (int j = 1; j < arr.length; j++) {
        if (arr[i] != arr[j]) {
            i++;
            arr[i] = arr[j];
        }
    }
    return i+1;
  }
   public static void main(String[] args) {
    Solution solution = new Solution();
    solution.bucketSortCars("abcdddefghiggjk");
   
  }
}
