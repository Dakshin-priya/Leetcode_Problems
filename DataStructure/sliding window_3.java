class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++)
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            
            max=Math.max(max,right+1-left);
        }
        return max;

    }
}
/*
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0, max = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            
            // Remove characters until no duplicate exists
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);
            max = Math.max(max, right+1 - left);
            right++;
        }

        return max;
    }
}
*/
