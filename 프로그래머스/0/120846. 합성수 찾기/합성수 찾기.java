class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int j = 4; j <= n; j++){
           for(int i = 2; i <= n; i++){
                if(j % i == 0 && j != i){
                    answer ++;
                    break;
                }
        } 
        }
        
        return answer;
    }
}