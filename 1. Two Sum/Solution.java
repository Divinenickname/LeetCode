//  https://leetcode.com/problems/two-sum/
//  Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//  You may assume that each input would have exactly one solution, and you may not use the same element twice.


//  Логика работы программы
/*
    1) вычитаем из target элемент массива. Получаем разность которую нужно найти в массиве
    2) проверяем есть ли это значение в map, если есть - всё супер, мы нашли ответ, если нет ->
    3) добавляем проверяемый элемент массива в map
    4) заворачиваем это в цикл
    5) profit
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = 0; //итератор для цикла, определяет позицию второго элемента в случае успеха

        if(nums.length < 2){
            return new int[]{0,0};
        }

        // Создаем HashMap с длинной равной длине массива.
        // HashMap нам нужна потому что в ней поиск происходит за константное время
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);

        while(a<nums.length){
            int temp = target - nums[a]; //результат вычитания
            if(map.containsKey(temp)){
                temp = map.get(temp);
                return new int[] {temp, a};
            }
            map.put(nums[a],a);
            a++;
        }

        return new int[] {0, 0};
    }
}
