import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[]  answer = new int[((slicer[1] - slicer[0] )/slicer[2])+1];
        int idx = 0;
        //switch-case문 사용..?
        switch(n){
            case 1 :
                return Arrays.copyOfRange(num_list, 0,slicer[1]+1);
            case 2 :
                return Arrays.copyOfRange(num_list, slicer[0],num_list.length);
            case 3 :
                return Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
            case 4 :
                for(int i = slicer[0]; i <= slicer[1]; i += slicer[2]){
                   
                    answer[idx] = num_list[i];
                    idx++;
                }
        }
        return answer;
    }
}