// https://leetcode.com/problems/shortest-palindrome/

class Solution {
    //Input: "aacecaaa"
    //Output: "aaacecaaa"

    //Input: "abcd"
    //Output: "dcbabcd"

    public String shortestPalindrome(String s) {
        String rt = "";

        if(isPalindrome(s)){
            rt = s;
        }
        else {
            StringBuilder sb = new StringBuilder(s.substring(1)).reverse();
            rt = sb.toString() + s;
        }

        return rt;
    }

    private boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder(s).reverse();
        return s.equals(sb.toString());
    }

    private void palindromInside(String s){

    }
}
