class Solution {

    void helper(String digits, HashMap<Integer, String> map, int idx,
                List<String> list, StringBuilder sb) {

        if (idx == digits.length()) {
            list.add(sb.toString());
            return;
        }

        String s = map.get(digits.charAt(idx)-'0');

        for (int i = 0; i < s.length(); i++) { 
            sb.append(s.charAt(i));
            helper(digits, map, idx + 1, list, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.isEmpty()) return list;

        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        helper(digits, map, 0, list, new StringBuilder());

        return list;
    }
}