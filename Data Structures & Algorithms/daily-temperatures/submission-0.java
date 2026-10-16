

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s1 = new Stack<>();
        int[] ans = new int[temperatures.length];
        for (int i = temperatures.length - 1; i >= 0; i--) {

            while (!s1.isEmpty() &&
            temperatures[s1.peek()] <= temperatures[i]) {
            s1.pop();
            }

            if (!s1.isEmpty()) {
                ans[i] = s1.peek() - i;
            } else {
                ans[i] = 0;
            }

            s1.push(i);
        }

        return ans;
    }
}