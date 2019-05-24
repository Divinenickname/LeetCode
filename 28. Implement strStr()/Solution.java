class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;

        if(needle.length()>1){
            int i = 0;
            while(i<=haystack.length()-needle.length()){
                String line = haystack.substring(i, i+needle.length());
                if(line.equals(needle)){
                    //проверяем такие же буквы внутри haystack как и в needle
                    index=i;
                    break;
                }
                    i++;
            }
        } else if(needle.length()==1){
            for (int i = 0; i < haystack.length(); i++) {
                if(haystack.charAt(i) == needle.charAt(0)){
                    index = i;
                    break;
                }
            }
        } else{
            index = 0;
        }

        return index;
    }
}
