class Solution {
    public int solution(int order) {
        String s = Integer.toString(order);
        String [] arr = s.split("");
        int answer = 0;
        
        for(String a : arr){
            if(Integer.parseInt(a) % 3 == 0 && Integer.parseInt(a) != 0){
                answer += 1;
            }
        }
        
        return answer;
    }
}