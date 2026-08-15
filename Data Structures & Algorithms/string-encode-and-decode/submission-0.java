class Solution {

    public String encode(List<String> strs) {
        if (strs.size() == 0) {
            return "";
        }
        String result = "";
        for (String s : strs) {
            int length = s.length();
            result = result + length + "#" + s;
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int indexCounter = 0;
        while (indexCounter < str.length()) {
            int j = indexCounter;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(indexCounter, j));
            list.add(str.substring(j + 1, j + 1 + length));
            indexCounter = j + 1 + length;
        }
        return list;
    }
}
