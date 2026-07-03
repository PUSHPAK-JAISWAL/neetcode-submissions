class Solution {
    public boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if (s.equals(sb.toString())) return true; 
        boolean flag = false;
        for (Character c : s.toCharArray()) {
            String strChar = String.valueOf(c);
            if (s.replace(strChar, "").equals(sb.toString().replace(strChar, ""))) {
                flag = true;
                break; 
            }
        }
        return flag;
    }
}