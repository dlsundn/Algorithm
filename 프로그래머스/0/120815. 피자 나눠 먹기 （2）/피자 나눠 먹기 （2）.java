class Solution {
    public int solution(int n) {
        
        int answer = 1;
        while(true){
            if(n*answer % 6 == 0){
                break;
            }
            answer += 1;
        }
        return n*answer/6;
    }
}