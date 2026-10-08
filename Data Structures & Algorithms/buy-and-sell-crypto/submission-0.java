class Solution {
    public int maxProfit(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
               int profit = arr[j] - arr[i];
               max = Math.max(max,profit);
            }
        }
        return max<0?0:max;

    }
}
