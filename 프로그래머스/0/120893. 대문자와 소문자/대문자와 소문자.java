class Solution {
    public String solution(String my_string) {
        String answer = "";
        int a = 'A' - 'a';
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z'){
                answer += (char)(my_string.charAt(i) + a);
            } else{
                answer += (char)(my_string.charAt(i) - a);
            }
        }
        return answer;
    }
}