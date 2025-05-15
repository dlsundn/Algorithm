import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        //Arrays.asList(배열이름).contains(특정값)
        for(int i = 0; i < s1.length; i++){
            if(Arrays.asList(s2).contains(s1[i])){
                answer += 1;
            }
        }
        return answer;
    }
}