class Solution {

    void solve(int arr[], List<List<Integer>> l1,
               List<Integer> l2, int idx, boolean visited[]) {

        if (idx == arr.length) {
            l1.add(new ArrayList<>(l2));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                l2.add(arr[i]);

                solve(arr, l1, l2, idx + 1, visited);

                l2.remove(l2.size() - 1);
                visited[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        boolean visited[] = new boolean[nums.length];

        solve(nums, l1, l2, 0, visited);

        return l1;
    }
}