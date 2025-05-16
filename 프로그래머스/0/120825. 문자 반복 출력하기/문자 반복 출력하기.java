import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        StringBuffer sb = new StringBuffer();
        String[] str = my_string.split("");
        
        for(int i = 0; i < str.length; i++){
            sb.append(str[i].repeat(n));
        }
        
        return sb.toString();
    }
}