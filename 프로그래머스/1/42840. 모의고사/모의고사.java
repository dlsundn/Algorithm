class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        //1번 : 12345
        //2번 : 21232425 홀수는 전부 2번
        //3번 : 3311224455 패턴
        //시험은 최대 10000문제
        //문제를 가장 많이 맞힌 사람이 누구인지 배열에 담아 return
        
        int [] one = {1,2,3,4,5};
        int [] two = {2,1,2,3,2,4,2,5};
        int [] three = {3,3,1,1,2,2,4,4,5,5};
        
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        for(int i = 0; i  < answers.length; i++){
            if(answers[i] == one[i%one.length]){
                sum1 += 1;
            }
            if(answers[i] == two[i%two.length]){
                sum2 += 1;
            }
            if(answers[i] == three[i%three.length]){
                sum3 += 1;
            }
        }
        
        //sum1,sum2,sum3 대소 비교후 answer 배열에 넣기
        
        if(sum1 == sum2 && sum2 == sum3){
            answer = new int[]{1,2,3};
        }else if(sum1 > sum2 && sum1 > sum3){
            answer = new int[]{1};
        }else if(sum2 > sum1 && sum2 > sum3){
            answer = new int[]{2};
        }else if(sum3 > sum1 && sum3 > sum2){
            answer = new int[]{3};
        }else if(sum1 == sum2){
            answer = new int[]{1,2};
        }else if(sum2 == sum3){
            answer = new int[]{2,3};
        }else if(sum1 == sum3){
            answer = new int[]{1,3};
        }
        
        return answer;
    }
}