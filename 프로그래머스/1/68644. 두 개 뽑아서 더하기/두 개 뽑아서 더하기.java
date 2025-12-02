import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        //int[] answer = {};
        //나올 수 있는 모든 경우의 수 (n-1)+(n-2)..
        //모든 덧셈을 arraylist에 담기
        //arraylist를 정렬
        //set에 담기
        //나의 생각 오류: set에 담으면 list에 담은 순서 그대로 원소가 담길줄 알았음 but set은 순서를 보장하지 않음
        //순서를 보장하는 set은 LinkedHashSet
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < numbers.length - 1 ; i++){
            for(int j = i+1; j < numbers.length; j++){
                list.add(numbers[i] + numbers[j]);
            }
        }
        
        Collections.sort(list);
        
        Set<Integer> set = new LinkedHashSet<Integer>(list);
        
        
        
        int[] answer = set.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
        return answer;
    }
}