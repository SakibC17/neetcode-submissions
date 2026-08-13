class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String str : strs) {
            // Sort the string
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            // Check if this string is a key in the hashmap
            //  if false, make it with an empty arraylist and return the value
            //  if true, return the value
            // add the current string to the list
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}

// Time Complexity: O(m * n log n)
//                  m = number of strings
//                  n = average length of strings
//                  n log n, because thats the sorting time complexity
// Space Complexity: O(m * n)
//                   store m strings, with an average length of n 