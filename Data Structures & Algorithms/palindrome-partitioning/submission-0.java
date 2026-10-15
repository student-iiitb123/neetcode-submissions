
class Solution {
    void helper(String s, List<String> ss, List<List<String>> sss) {
        if (s.length() == 0) {
            sss.add(new ArrayList<>(ss));
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String p = s.substring(0, i + 1);

            if (isPalindrome(p)) {
                ss.add(p);

                helper(s.substring(i + 1), ss, sss);

                ss.remove(ss.size() - 1);
            }
        }
    }

    boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public List<List<String>> partition(String s) {
        List<List<String>> sss = new ArrayList<>();
        List<String> ss = new ArrayList<>();

        helper(s, ss, sss);

        return sss;
    }
}
