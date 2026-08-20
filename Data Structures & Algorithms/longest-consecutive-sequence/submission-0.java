class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int i : nums) {
            numSet.add(i);
        }
        int longest = 0;
        for (int i : nums) {
            if (!numSet.contains(i-1)) {
                int length = 1;
                while (numSet.contains(i + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
