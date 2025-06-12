class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x",-1);
        int [] answer = new int[arr.length];
        int idx = 0;
        // 고민해야될 점 x와 x사이에 문자가 없는 경우
        
        for(String s : arr){
            
            answer[idx] = s == "" ? s.length() + 1 : s.length();
            idx++;
        }
        
        return answer;
    }
}