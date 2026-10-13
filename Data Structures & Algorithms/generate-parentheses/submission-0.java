class Solution {
    void helper(int n, List<String> l, StringBuilder s, int open, int close) {

        if (open == n && close == n) {
            l.add(s.toString());
            return;
        }

        if (open < n) {
            helper(n, l, s.append('('), open + 1, close);
            s.deleteCharAt(s.length() - 1);
        }

        if (open > close) {
            helper(n, l, s.append(')'), open, close + 1);
            s.deleteCharAt(s.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        helper(n, l, new StringBuilder(), 0, 0);
        return l;
    }
}