class Solution {
    public boolean isValid(String s) {
        Stack<Character> ss = new Stack<>();

        if (s.length() == 0) {
            return true;
        }

        if (s.charAt(0) == ']' || s.charAt(0) == ')' || s.charAt(0) == '}') {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                ss.push(ch);
            }

            if (ch == ')') {
                if (ss.isEmpty() || ss.peek() != '(') {
                    return false;
                }
                ss.pop();
            }

            if (ch == '}') {
                if (ss.isEmpty() || ss.peek() != '{') {
                    return false;
                }
                ss.pop();
            }

            if (ch == ']') {
                if (ss.isEmpty() || ss.peek() != '[') {
                    return false;
                }
                ss.pop();
            }
        }

        return ss.isEmpty();
    }
}