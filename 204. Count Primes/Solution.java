// https://leetcode.com/problems/count-primes/

class Solution {
    public int countPrimes(int n) {
        int count = 0;
        // true если число простое
        boolean[] arr = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = true;
        }

        // начинаем с 2, т.к. 0 и 1 не имеют смысла 
        for (int i = 2; i*i < n; i++) {
            if(arr[i]){
                for (int j = i*i; j <n ; j = j+i) {
                    arr[j] = false;
                }
            }
        }

        for (int i = 2; i <arr.length ; i++) {
            if(arr[i]) count++;
        }




        return count;
    }
}
