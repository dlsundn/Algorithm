class Solution {
    public int[] solution(int[] num_list) {
        
        int b = 0;
        int a = 0;
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0) {
                 a += 1;    
            }else 
                b += 1;
        }
        int[] answer = {a,b};
        return answer;
    }
}