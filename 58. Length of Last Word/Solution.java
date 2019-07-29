class Solution {
    public int lengthOfLastWord(String s) {
        if(s.isEmpty()){
            return 0;
        }
        
        int l = s.length()-1;
        int c = 0;
        
        while(l>=0 && s.charAt(l)==' '){
            l--;
        }
        
        while(l>=0 && s.charAt(l)!= ' '){
            c++;
            l--;
        }
        return c;
    }
}
