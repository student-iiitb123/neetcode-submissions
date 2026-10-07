class Solution {
    public boolean isPalindrome(String s) {
   s = s.replaceAll("[^a-zA-Z0-9]", "");
   String s1 = s.toLowerCase();
    
        int i =0;
        int j= s1.length()-1; 
        while(i<j){
            if(s1.charAt(i) != s1.charAt(j)){
             return false;
            }
           
            i++;
            j--;
           
        }
        return true;
        
    }
}
