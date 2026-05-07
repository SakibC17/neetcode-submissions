class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; 
        }
        java.util.HashMap<Character, Integer> sLetters = new java.util.HashMap<Character, Integer>();
        java.util.HashMap<Character, Integer> tLetters = new java.util.HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            sLetters.put(s.charAt(i), sLetters.getOrDefault(s.charAt(i), 0) + 1);
            tLetters.put(t.charAt(i), tLetters.getOrDefault(t.charAt(i), 0) + 1);
        }
        if (sLetters.equals(tLetters)) {
            return true;
        }
        return false; 
    }
}
