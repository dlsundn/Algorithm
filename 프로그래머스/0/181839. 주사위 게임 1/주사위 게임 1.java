import java.lang.*;
class Solution {
    public int solution(int a, int b) {
       
        int answer = a % 2 != 0 ? (b%2 != 0 ? a*a + b*b : 2*(a+b)) : (b%2 != 0 ? 2*(a+b) : Math.abs(a-b));
        return answer;
    }
}