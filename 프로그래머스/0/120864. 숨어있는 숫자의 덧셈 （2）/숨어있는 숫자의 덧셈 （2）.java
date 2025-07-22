class Solution {
    public int solution(String my_string) {
        int answer = 0;

        // ,로 split
        // 자연수 판별 후 answer에 더하기
        // 자연수 제외한 문자 ,로 변경
        my_string = my_string.replaceAll("[^0-9]",",");
        
        String[] arr = my_string.split(",");
        
        for(int i = 0 ; i < arr.length; i++){
            if(!arr[i].equals("")){
                answer += Integer.parseInt(arr[i]);
            }
        }
       
        return answer;
    }
}