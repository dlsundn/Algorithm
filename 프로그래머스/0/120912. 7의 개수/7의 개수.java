class Solution {
    public int solution(int[] array) {
        int answer = 0;
        //String.valueOf(num) -> 숫자를 문자로
         for (int num : array) {
            String str = String.valueOf(num);
            answer += str.length() - str.replace("7", "").length();
        }

       
        
        return answer;
    }
}