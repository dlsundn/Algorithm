class Solution {
    public String solution(int age) {
        String answer = "";
        //아스키 코드 0-9 (48~57) a-z(97-122)
        String str = Integer.toString(age);
        for(int i = 0; i < str.length(); i++){
            answer += (char)(str.charAt(i) + 49);
        }
        return answer;
    }
}