class Solution {
    public String solution(String rsp) {
        String answer = rsp.replace("2", "1").replace("0", "3").replace("5", "2").replace("1", "0").replace("3","5");
        return answer;
    }
}