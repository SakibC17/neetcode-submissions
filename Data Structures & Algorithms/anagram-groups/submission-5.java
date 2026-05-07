class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> maps = new HashMap<>();  
        for (String s : strs) {
            HashMap<Character, Integer> currentMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                currentMap.put(c, currentMap.getOrDefault(c, 0) + 1);
            }
            ArrayList<String> list = maps.getOrDefault(currentMap, new ArrayList<String>());
            list.add(s);
            maps.put(currentMap, list);
        }
        return new ArrayList<>(maps.values());
    }
}
