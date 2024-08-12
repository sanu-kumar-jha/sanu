package Sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  String bucketSortCars(String cars) {
  Map<Character, Integer> frequencyMap = new HashMap<>(52);

      // Loop through all the characters in the string to fill the frequency map
      for (int i = 0; i < cars.length(); ++i) {
          // Merge the current character into the map, increasing its count by 1
          frequencyMap.merge(cars.charAt(i), 1, Integer::sum);
      }

      // Create a list to store the characters (for sorting purposes)
      List<Character> characters = new ArrayList<>(frequencyMap.keySet());
    
      // Sort the character list based on their frequencies in descending order
      characters.sort((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));
    
      // Use StringBuilder to build the result string
      StringBuilder sortedString = new StringBuilder();
    
      // Loop through the sorted list of characters
      for (char c : characters) {
          // Append each character to the StringBuilder based on its frequency
          for (int frequency = frequencyMap.get(c); frequency > 0; --frequency) {
              sortedString.append(c);
          }
      }
    
      // Return the sorted string
      return sortedString.toString();

 }
    public static void main(String[] args) {
        String str = "abbssaaaarrtetehhh";
         Solution solution = new Solution();
         solution.bucketSortCars(str);
    }
  }
  