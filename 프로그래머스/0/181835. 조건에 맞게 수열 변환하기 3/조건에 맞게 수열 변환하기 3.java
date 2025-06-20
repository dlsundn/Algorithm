class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int a = k % 2 == 0 ? arr[i] + k : arr[i] * k;
            answer[i] = a;
        }
        return answer;
    }
}