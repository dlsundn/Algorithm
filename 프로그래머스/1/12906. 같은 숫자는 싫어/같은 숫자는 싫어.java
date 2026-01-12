import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
       
        
        List<Integer> list = new ArrayList<Integer>();
        
        int a = 0;
        list.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++){ 
            if(list.get(a) == arr[i]){
                continue;
            }
            
            list.add(arr[i]);
            a++;
            
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}