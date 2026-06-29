class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // 1. Convert to char array, sort, and convert back to String
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // 2 & 3. Add to existing list, or create a new one if it doesn't exist
            if (map.containsKey(sorted)) {
                map.get(sorted).add(s);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(s);
                map.put(sorted, newList);
            }
        }

        // 4 & 5. Return the values of the map as a List of Lists
        return new ArrayList<>(map.values());
    }
}