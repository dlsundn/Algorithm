import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                arr.add(numlist[i]);
            }
        }
        return arr;
    }
}