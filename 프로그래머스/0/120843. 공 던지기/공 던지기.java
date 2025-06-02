class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int a = 0;
        for(int i = 0; i < numbers.length * k; i += 2){
            answer = numbers[i%numbers.length];
            a += 1;
            if( a == k){
                break;
            }
        }
        return answer;
    }
}