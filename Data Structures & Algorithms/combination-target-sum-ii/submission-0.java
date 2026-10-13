class Solution {
       public void solve(int arr[],int target, List<List<Integer>> l1, List<Integer> l2,int idx,int sum){

       if (sum == target) {
            l1.add(new ArrayList<>(l2));
            return;
        }

    
        if (idx == arr.length || sum > target) {
            return;
        }

        l2.add(arr[idx]);
        solve(arr,target,l1,l2,idx+1,sum + arr[idx]);
        l2.remove(l2.size()-1);

        while(idx+1 <arr.length && arr[idx] == arr[idx+1]){
            idx++;
        }
        solve(arr,target,l1,l2,idx+1,sum);

        

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();
    Arrays.sort(candidates);

  solve(candidates,target,l1,l2,0,0);
    return l1;
    }
}
