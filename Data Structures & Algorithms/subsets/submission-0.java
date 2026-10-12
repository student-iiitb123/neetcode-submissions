class Solution {

    void helper(int arr[], List<List<Integer>> ll, List<Integer> l, int idx) {

        ll.add(new ArrayList<>(l));

        for (int i = idx; i < arr.length; i++) {
            l.add(arr[i]);
            helper(arr, ll, l, i + 1);
            l.remove(l.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        helper(arr, ll, l, 0);

        return ll;
    }
}