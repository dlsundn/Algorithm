class Solution {
    public int solution(String myString, String pat) {
        String str = "";
        String [] arr = myString.split("");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("A")){
                str += "B";
            }else {
                str += "A";
            }
        }
        int answer = str.contains(pat) ? 1 : 0;
        return answer;
    }
}