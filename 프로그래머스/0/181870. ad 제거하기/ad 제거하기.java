class Solution {
    public String[] solution(String[] strArr) {
        
        int num = 0;
        
        for(String str : strArr){
            if(!str.contains("ad")){
                num++;
            }
        }
        
        String[] answer = new String[num];
        
        int idx = 0;
        
        for(String str : strArr){
            if(!str.contains("ad")){
                answer[idx] = str;
                idx++;
            }
        }
        return answer;
    }
}