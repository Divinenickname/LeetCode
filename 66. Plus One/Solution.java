class Solution {
    public int[] plusOne(int[] digits) {
        int mem = 1;
        int l = digits.length-1;
        
        while(mem!=0){
            if(l>=0){
               digits[l] += mem;
                mem--;

                if(digits[l]==10){
                    digits[l]=0;
                    mem++;
                }
                l--; 
            }
            else{
                digits = expandArr(digits);
                l++;
            }
            
        }
        return digits;
    }
    
    public int[] expandArr(int[] digits){
        int[] tmp = new int[digits.length+1];
        for(int i = 1; i<digits.length; i++){
            tmp[i] = digits[i-1];
        }
        
        return tmp;
    }
}
