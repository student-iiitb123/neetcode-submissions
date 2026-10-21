class Solution {

    void helper(int arr[], List<List<Integer>> ll, List<Integer> l) {

        for (int i = 0; i < arr.length; i++) {

            if (i > 0 && arr[i - 1] == arr[i]) {
                continue;
            }

            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {

                if (j > i+1&& arr[j - 1] == arr[j]) {
                    j++;
                    continue;
                }

                if (arr[j] + arr[k] == -arr[i]) {
                    l.add(arr[i]);
                    l.add(arr[j]);
                    l.add(arr[k]);

                    ll.add(new ArrayList<>(l));
                    l.clear();

                    j++;
                    k--;
                }
                else if (arr[j] + arr[k] > -arr[i]) {
                    k--;
                }
                else {
                    j++;
                }
            }
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        Arrays.sort(nums);

        helper(nums, ll, l);

        return ll;
    }
}