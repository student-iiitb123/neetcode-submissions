class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int suffix[] = new int[n];
        suffix[n - 1] = arr[n - 1];

for (int i = n - 2; i >= 0; i--) {
    suffix[i] = Math.max(arr[i], suffix[i + 1]);
}
int max = Integer.MIN_VALUE;
for(int i =0;i<arr.length;i++){
    int profit = suffix[i]-arr[i];
    max = Math.max(max,profit);
}


return max;


        }
}
