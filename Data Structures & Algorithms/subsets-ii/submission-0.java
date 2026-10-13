class Solution {
     public void solve(int arr[],List<List<Integer>>l1,List<Integer>l2,int i){
    if(i == arr.length){
      l1.add(new ArrayList<>(l2));
      return;
    }
     
     l2.add(arr[i]);
     solve(arr,l1,l2,i+1);
     l2.remove(l2.size()-1);
     while(i+1 < arr.length && arr[i] == arr[i+1]){
        i++;
     }
     solve(arr,l1,l2,i+1);
  }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        solve(nums,l1,l2,0);
        return l1;
    }
}
