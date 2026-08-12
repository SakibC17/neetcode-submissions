class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }
}

// Time complexity: O(n)
// Space complexity: O(n)

// Big-O notation, Order of Growth
// O(1): constant
// O(log n): logarithmic
// O(n): linear
// O(n log n): linearithmic
// O(n²): quadratic
// O(n³): cubic
// O(2ⁿ): exponential
// O(n!): factorial