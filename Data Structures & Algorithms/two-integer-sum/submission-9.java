class Solution {
    public int[] twoSum(int[] nums, int target) {
        java.util.HashMap<Integer, Integer> pastNumbers = new java.util.HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (pastNumbers.containsKey(difference)) {
                return new int[]{pastNumbers.get(difference), i};
            } 
            pastNumbers.put(nums[i], i);
        }
        return new int[]{};
    }
}
