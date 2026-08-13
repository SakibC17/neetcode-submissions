class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(number);
        }
        int[] res = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i > 0; i--) {
            if (buckets[i] != null) {
                for (int freqNum : buckets[i]) {
                    res[index] = freqNum;
                    index++;

                    if (index == k) {
                        return res;
                    }
                }
            }
        }

        return res;
    }
}

// Time Complexity: O(n)
// - Build frequency map: O(n)
// - Build buckets: O(n)
// - Traverse buckets: O(n)
// Overall: O(n)
//
// Space Complexity: O(n)
// - HashMap: O(n)
// - Bucket array + lists: O(n)
// - Result array: O(k)
// Overall: O(n), since k <= n




// Naive Solution: 
// Make hashmap with frequencies
// then sort the hashmap by their value
// then return the keys of top k values

// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         int[] result = new int[k];
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         List<Map.Entry<Integer, Integer>> values =
//             new ArrayList<>(map.entrySet());

//         values.sort((a, b) -> b.getValue() - a.getValue());

//         for (int i = 0; i < k; i++) {
//             result[i] = values.get(i).getKey();
//         }

//         return result;
//     }
// }