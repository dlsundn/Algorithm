class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        
        if(arr1.length != arr2.length){
            if(arr1.length > arr2.length){
                return answer = 1;
            }else {
                return answer = -1;
            }
        }else {
            for(int a : arr1){
                sum1 += a;
            }
            for(int b : arr2){
                sum2 += b;
            }
            if(sum1 == sum2){
                return answer = 0;
            }else if (sum1 > sum2){
                return answer = 1;
            }else{
                return answer = -1;
            }
        }
        
        
    }
}