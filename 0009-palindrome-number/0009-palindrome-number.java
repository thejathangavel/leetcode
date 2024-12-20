class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int rev = 0;
        
        while(org > 0){
            int unit =org % 10;
            rev=rev*10+unit;
            org=org/10;
        }
     return rev==x;
        }
    }
            