class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length() == 0) return 0;

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), 1);

            int j = i + 1;

            while (j < s.length()) {
                if (!map.containsKey(s.charAt(j))) {
                     max = Math.max(max, j - i + 1);
                     map.put(s.charAt(j),1);
                     j++;
                  
                } else {
                    map.clear();
                    break;
                   
                }
            }
        }

        return max == Integer.MIN_VALUE ? 1 : max;
    }
}