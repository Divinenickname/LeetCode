//   https://leetcode.com/problems/3sum

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        //если массив меньше 2, то вернем пустой список
        if (nums.length < 3) {
            return list;
        }


        Arrays.sort(nums);


        for (int i = 0; i <=nums.length-3; i++) {
            int start = i+1;
            int end = nums.length-1;

            while (start<end){

                int sum = nums[i]+nums[start]+nums[end];

                if(sum == 0){
                    list.add(Arrays.asList(nums[i],nums[start],nums[end]));

                    //start++ чтобы цикл не стал бесконечным
                    //end-- потому что при увеличении start число в идеале увеличится и нет смысла складывать с тем же end
                    start++;
                    end--;

                    //Проверяем, чтобы следующее после start число не превышало границы массива
                    //Также проверяем, чтобы число перед start и после были одинаковые со start
                    while(start+1<=nums.length-1 && nums[start] == nums[start+1] && nums[start] == nums[start-1]){
                        start++;
                    }

                    //Если предыдущий цикл выполнится, то мы остановимся в позиции перед новым числом.
                    //Здесь мы проверяем чтобы не выйти за границы массива
                    //И если число перед start такоеже, а следующее после start уникальное - переносим старт туда
                    if(start+1<=nums.length-1 && nums[start] != nums[start+1] && nums[start] == nums[start-1]){
                        start++;
                    }
                }

                //в зависимости от полученного значения сдвигаем старт или конец.
                if(sum<0){
                    start++;
                }
                if(sum>0){
                    end--;
                }


            }

            //Для того чтобы i было уникальным, нам нет необходимости проверять для одинаковых nums[i]
            while(i+1<=nums.length-1 && nums[i] == nums[i+1]){
                i++;
            }


        }

        return list;
    }
}
