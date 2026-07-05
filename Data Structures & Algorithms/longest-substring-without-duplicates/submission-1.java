class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        Queue<Character> queue = new LinkedList<>();
        int count = 0;
        for(char c : s.toCharArray()) {
            if(set.contains(c)) {
                count = Math.max(count, set.size());
                while (!queue.isEmpty() && set.contains(c)) {
                    char removed = queue.poll();
                    set.remove(removed);
                }
            }
            set.add(c);
            queue.add(c);
        }
        count = Math.max(count, set.size());
        return count;
    }
}