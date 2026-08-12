class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                result[0] = map.get(difference);
                result[1] = i;
            }
            map.put(nums[i], i);
        }

        return result;
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