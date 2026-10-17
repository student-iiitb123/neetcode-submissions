
class Solution {
    public int evalRPN(String[] arr) {
        Stack<Integer> s = new Stack<>();
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            String ch = arr[i];

            if (!ch.equals("+") && !ch.equals("-")
                    && !ch.equals("*") && !ch.equals("/")) {
                s.push(Integer.parseInt(ch));
                continue;
            }

            int b = s.pop();
            int a = s.pop();

            switch (ch) {
                case "+":
                    result = a + b;
                    break;

                case "-":
                    result = a - b;
                    break;

                case "*":
                    result = a * b;
                    break;

                case "/":
                    result = a / b;
                    break;
            }

            s.push(result);
        }

        return s.pop();
    }
}
