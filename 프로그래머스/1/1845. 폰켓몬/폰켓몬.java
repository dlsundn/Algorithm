import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        
        if(set.size() <= nums.length/2){
            answer = set.size();
        }else {
            answer = nums.length/2;
            
        }
        
        
        return answer;
        
         //1. nums 를 set에 담기 -> 중복제거
    //2. set의 길이 구하기
    //3. if set의 길이 짝수 -> answer, set의 길이 홀수 -> 리턴
    }
}