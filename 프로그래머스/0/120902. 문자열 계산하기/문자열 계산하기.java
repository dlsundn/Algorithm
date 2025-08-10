class Solution {
    public int solution(String my_string) {
        //⭐연산자가 하나만 존재하는 것이 아니라 여러개 존재 가능
        //1.공백 기준으로 split 해서 배열 저장
        //짝수번째는 숫자, 홀수 번째는 연산자
        String arr[] = my_string.split(" ");
        //2. arr의 길이 구하기
        //3. arr의 짝수번째는 integer로 변경
       
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        int result = 0;
        //3. 연산자가 +, -밖에 없으므로 +,-인지 판단한 후 answer 반환
        if(arr[1].equals("+")){
            result = a+b;
        }else{
            result = a-b;
        }
        if(arr.length > 3){
            for(int i = 3; i <arr.length-1; i += 2){
                if(arr[i].equals("+")){
                    result += Integer.parseInt(arr[i+1]);
                }else{
                    result -=  Integer.parseInt(arr[i+1]);
                }
            }
        }
        return result;

    }
}