import java.lang.Math;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        int len = num.length();
        int num1 = (int)Math.pow(10,len+1);
        
        for(int i = num1 ; i >= 10; i /= 10){
            int a = n%i;
            int b = i/10;
            answer += a/b;
        }
        return answer;
    }
}