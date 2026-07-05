class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for(int i = 0;i<s1.length();i++) {
            s1Count[s1.charAt(i)-'a']++;
            s2Count[s2.charAt(i)-'a']++;
        }

        if (matches(s1Count, s2Count)) return true;

        for (int r = s1.length(); r < s2.length(); r++) {
            s2Count[s2.charAt(r) - 'a']++;
            int l = r - s1.length();
            s2Count[s2.charAt(l) - 'a']--;
            if (matches(s1Count, s2Count)) {
                return true;
            }
        }

        return false;

    }
    private boolean matches(int[] s1Counts, int[] windowCounts) {
        for (int i = 0; i < 26; i++) {
            if (s1Counts[i] != windowCounts[i]) {
                return false;
            }
        }
        return true;
    }
}
