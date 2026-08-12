class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        return map1.equals(map2);
    }
}

// Time complexity: O(n), more specifically O(s + t)
// Space complexity: O(n), more specifically O(s + t)

// Alternative method that uses no extra memory:
// Sort both strings, then compare if they are equal
// In this method, time complexity will probably be worse due to sorting algorithm but space complexity is nothing. 

// Big-O notation, Order of Growth
// O(1): constant
// O(log n): logarithmic
// O(n): linear
// O(n log n): linearithmic
// O(n²): quadratic
// O(n³): cubic
// O(2ⁿ): exponential
// O(n!): factorial
