class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i-1] * nums[i-1];
        }
        int postFix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= postFix;
            postFix *= nums[i];
        }
        return res;

    }
}  
























// Prefix Suffix solution
// ------------------------------------------
// ------------------------------------------
        // int length = nums.length;
        // int[] pref = new int[length];
        // int[] suff = new int[length];
        // int[] products = new int[length];

        // pref[0] = 1;
        // suff[length - 1] = 1;

        // for (int i = 1; i < length; i++) {
        //     pref[i] = nums[i-1] * pref[i-1];
        // }
        // for (int i = length - 2; i >= 0; i--) {
        //     suff[i] = nums[i+1] * suff[i+1];
        // }
        // for (int i = 0; i < length; i++) {
        //     products[i] = pref[i] * suff[i];
        // }
        // return products;


// Division solution
// ------------------------------------------
// ------------------------------------------
        // int productTotal = 1, zeroCount = 0;
        // for (int i : nums) {
        //     if (i != 0) {
        //         productTotal *= i;
        //     } else {
        //         zeroCount++;
        //     }
        // }

        // if (zeroCount > 1) {
        //     return new int[nums.length];
        // }

        // int[] products = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     if (zeroCount > 0) {
        //         products[i] = (nums[i] == 0) ? productTotal : 0;
        //     } else {
        //         products[i] = productTotal / nums[i];
        //     }
        // }
        // return products;
