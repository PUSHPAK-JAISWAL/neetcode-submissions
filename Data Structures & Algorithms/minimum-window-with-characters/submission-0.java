class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int[] tcounts = new int[128];
        for(char c : t.toCharArray()) {
            tcounts[c]++;
        }
        int[] sCount = new int[128];
        int required = 0;
        for (int count : tcounts) {
            if (count > 0) required++;
        }
        int formed = 0; 
        int l = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        for (int r = 0; r < s.length(); r++) {
            char rightChar = s.charAt(r);
            sCount[rightChar]++;
            if (tcounts[rightChar] > 0 && sCount[rightChar] == tcounts[rightChar]) {
                formed++;
            }
            while (formed == required) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    minStart = l;
                }
                char leftChar = s.charAt(l);
                sCount[leftChar]--;
                if (tcounts[leftChar] > 0 && sCount[leftChar] < tcounts[leftChar]) {
                    formed--;
                }
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}