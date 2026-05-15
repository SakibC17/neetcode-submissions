class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        if (clean.length() < 2) {
            return true;
        }
        for (int i = 0, j = clean.length() - 1; i < j; i++, j--) {
            if (clean.charAt(i) != clean.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}