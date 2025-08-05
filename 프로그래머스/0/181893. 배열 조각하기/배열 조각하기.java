import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = arr;
        //query의 원소가 짝수인지 홀수인지 판별
        //1. 짝수인 경우  arr를 자르기 -> Arrays.copyOfRange 이용하기
        //Arrays.copyOfRange(자를배열, 시작 인덱스, 끝 인덱스+1)
        // 1. 짝수인 경우 -> Arrays.copyOfRange(arr,0,query[i] + 1)
        // 2. 홀수인 경우 -> Arrays.copyOfRange(arr,query[i],arr.length)
        // -> 런타임 에러
        for(int i = 0; i < query.length; i++){
            
            if(i % 2 == 0){
                answer = Arrays.copyOfRange(answer,0,query[i]+1);
            }else{
                answer = Arrays.copyOfRange(answer,query[i], answer.length);
            }

        }
        return answer;
    }
}