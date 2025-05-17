class Solution {
    public String solution(String myString) {
        
        String answer = myString;
        for(char a : myString.toCharArray()){
            if(a < 'l'){
               
                answer = answer.replace(a,'l');
            }
        } 
        
        return answer;
    }
}