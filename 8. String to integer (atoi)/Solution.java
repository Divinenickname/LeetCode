// https://leetcode.com/problems/string-to-integer-atoi/

class Solution {
    public int myAtoi(String str) {
        HashMap<Integer, Integer> map = new HashMap<>(); //храним номер цифры в числе
        int sum = 0;

        int negative = 1;
        int a = 0;

        if(str.length() == 0) return 0;

        while(a<str.length() && str.charAt(a)==' '){
            if(a+1>=str.length()) return 0;
            a++;
        }

        //определим есть ли + или - перед числом
        if(str.charAt(a) == '-' || str.charAt(a)=='+'){
            if(str.charAt(a)=='-') negative = -1;
            if(a+1>=str.length()) return 0;
            a++;
        }

        //если это число то начинаем цикл
        if(str.charAt(a)>=48 && str.charAt(a)<=57){
            int pos = 0;
            while(a<str.length() && (str.charAt(a) >= 48 && str.charAt(a)<=57)){
                map.put(pos, (int)str.charAt(a) - 48);
                a++;
                pos++;
            }
        } else return 0;
        
        // Подсчет итога 
        int s = map.size()-1;
        int i = 0;
        while(s>=0){
            int buf = map.get(s);
            sum += map.get(s) * Math.pow(10.0, (double)i) * negative;
            s--;
            i++;
        }

        return sum;
    }
}
