class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> values =
            new ArrayList<>(map.entrySet());

        values.sort((a, b) -> b.getValue() - a.getValue());

        for (int i = 0; i < k; i++) {
            result[i] = values.get(i).getKey();
        }

        return result;
    }
}