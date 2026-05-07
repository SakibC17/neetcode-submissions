
class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.HashSet<Integer> numbers = new java.util.HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) {
                return true;
            }
            numbers.add(nums[i]);
        }
        return false;    
    }
}