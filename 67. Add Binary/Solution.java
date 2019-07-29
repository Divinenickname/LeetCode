class Solution {
    public String addBinary(String a, String b) {
        int l1 = a.length()-1;
        int l2 = b.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        
        while(l1 >=0 || l2>=0){
            int sum = carry;
            if(l1>=0) sum += a.charAt(l1--) - '0';
            if(l2>=0) sum += b.charAt(l2--) - '0';
            sb.insert(0, sum%2);
            carry = sum/2; 
        }
        
        if(carry>0) sb.insert(0,1);  
        
                
        return sb.toString();
    }
}
