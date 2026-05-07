class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap<HashMap<Character, Integer>, ArrayList<String>> maps = new HashMap<>();  
        // for (String s : strs) {
        //     HashMap<Character, Integer> currentMap = new HashMap<>();
        //     for (char c : s.toCharArray()) {
        //         currentMap.put(c, currentMap.getOrDefault(c, 0) + 1);
        //     }
        //     ArrayList<String> list = maps.getOrDefault(currentMap, new ArrayList<String>());
        //     list.add(s);
        //     maps.put(currentMap, list);
        // }
        // return new ArrayList<>(maps.values());
        HashMap<String, List<String>> groups = new HashMap<>();

        for (String s : strs) {

            int[] count = new int[26];

            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);

            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(s);
        }
        return new ArrayList<>(groups.values());
    }
}
