


class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;

        Stack<Integer> s = new Stack<>();
        int[] rightSmallest = new int[n];
        int[] leftSmallest = new int[n];

        // Next Smaller Element on the RIGHT
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                rightSmallest[i] = n;
            } else {
                rightSmallest[i] = s.peek();
            }

            s.push(i);
        }

        s.clear();

        // Previous Smaller Element on the LEFT
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                leftSmallest[i] = -1;
            } else {
                leftSmallest[i] = s.peek();
            }

            s.push(i);
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            int width = rightSmallest[i] - leftSmallest[i] - 1;
            int area = arr[i] * width;
            max = Math.max(max, area);
        }

        return max;
    }
}
