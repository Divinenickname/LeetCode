class Solution {
public String shortestPalindrome(String s) {

        int n = s.length();
        int i = 0;
        for (int j = n-1; j >=0; j--) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
            }
        }

        // Если строка является палиндромом.
        if (i == n) {
            return s;
        }

        String end = s.substring(i, n);
        String front = new StringBuilder(end).reverse().toString();
        String mid = shortestPalindrome(s.substring(0,i));

        return front + mid + end;
    }
    }
