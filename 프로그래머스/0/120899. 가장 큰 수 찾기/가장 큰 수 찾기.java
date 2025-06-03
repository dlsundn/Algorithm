import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] newArr = Arrays.copyOf(array, array.length);
        Arrays.sort(newArr);
        int a = newArr[newArr.length - 1];//최댓값
        //int b = Arrays.asList(array).indexOf(a); 
        int b = 0;
        // 최대값의 인덱스 구하기
        for(int i = 0 ; i < array.length; i ++){
            if(a == array[i]){
                b = i;
            }
        }
        
        int [] answer = {a,b};
        return answer;
    }
}