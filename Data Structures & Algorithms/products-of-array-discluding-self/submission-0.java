class Solution {
    public int[] productExceptSelf(int[] nums) {
        int productTotal = 1, zeroCount = 0;
        for (int i : nums) {
            if (i != 0) {
                productTotal *= i;
            } else {
                zeroCount++;
            }
        }

        if (zeroCount > 1) {
            return new int[nums.length];
        }

        int[] products = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 0) {
                products[i] = (nums[i] == 0) ? productTotal : 0;
            } else {
                products[i] = productTotal / nums[i];
            }
        }
        return products;

    }
}  
