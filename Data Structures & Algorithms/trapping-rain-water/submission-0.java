class Solution {
    public int trap(int[] arr) {

        //left max arr suffix arr
        
         int n = arr.length;
         int suffix[] = new int[n];
         suffix[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
        suffix[i] = Math.max(arr[i], suffix[i + 1]);
}


        //right max arr prefix arr

        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i = 1;i<n;i++){
            prefix[i] = Math.max(arr[i],prefix[i-1]);
        }

        int ans=0;

        for(int i =0;i<n;i++){
            ans += Math.min(prefix[i],suffix[i])-arr[i];

        }

        return ans;


        
    }
}
