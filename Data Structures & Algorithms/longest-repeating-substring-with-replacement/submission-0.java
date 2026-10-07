class Solution {
    public int characterReplacement(String s, int k) {
       int[] count = new int[26];
int left = 0, maxCount = 0, maxLength = 0;

for (int right = 0; right < s.length(); right++) {
    int charIdx = s.charAt(right) - 'A';
    count[charIdx]++;
    maxCount = Math.max(maxCount, count[charIdx]);
    while ((right - left + 1) - maxCount > k) {
    count[s.charAt(left) - 'A']--;
    left++;
}
maxLength = Math.max(maxLength, right - left + 1);
    }
    return maxLength;
    }
}
