class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map= new HashMap<>();

        for(char str:s.toCharArray()) {
            map.put(str,map.getOrDefault(str,0)+1);
        }

        HashMap<Character,Integer> map2= new HashMap<>();

        for(char str:t.toCharArray()) {
            map2.put(str,map2.getOrDefault(str,0)+1);
        }

        return map2.equals(map);
    }
}
