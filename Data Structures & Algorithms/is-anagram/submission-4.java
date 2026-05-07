class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            java.util.HashMap<Character, Integer> sLetters = new java.util.HashMap<Character, Integer>();
            for (char c : s.toCharArray()){
                sLetters.put(c, sLetters.getOrDefault(c, 0) + 1);
            }
            java.util.HashMap<Character, Integer> tLetters = new java.util.HashMap<Character, Integer>();
            for (char c : t.toCharArray()){
                tLetters.put(c, tLetters.getOrDefault(c, 0) + 1);
            }
            if (sLetters.equals(tLetters)) {
                return true;
            }
        }
        return false; 
    }
}
