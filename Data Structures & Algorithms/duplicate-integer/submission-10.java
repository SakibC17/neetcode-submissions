class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean status = false;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                status = true;
                break;
            } else {
                set.add(i);
            }
        }
        return status;
    }
}