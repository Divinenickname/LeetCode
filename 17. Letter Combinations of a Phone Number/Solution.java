// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

/*
  Суть в том, что мы будем вызывать метод рекурсивно перебирая все значения.
*/

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.equals("")) {
            return result;
        }

        StringBuilder sb = new StringBuilder();

        String[] map = {
                "",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        
        recursion(result, digits, sb, map);

        return result;
    }



    private void recursion(List<String> result, String digits, StringBuilder sb, String[] map){
    // Условием выхода из рекурсии будет длина строки равная длине подаваемого на вход значения
    // Если они равны, значит значение валидное, добавляем его в List
        if(sb.length() == digits.length()){
            result.add(sb.toString());
            return;
        }

        String btn = map[digits.charAt(sb.length())-'0'];

        for (int i = 0; i < btn.length(); i++) {
            sb.append(btn.charAt(i));
            recursion(result, digits, sb, map);
            
            // Это нужно для того, чтобы выбрать новую цифру из строки
            sb.deleteCharAt(sb.length()-1);
        }

        
    }

}
