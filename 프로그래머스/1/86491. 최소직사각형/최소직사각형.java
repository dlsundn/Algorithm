class Solution {
    public int solution(int[][] sizes) {
        //가로 세로중 더 큰 값을 가로에 몰아주기
        for(int i = 0; i < sizes.length; i++){
            int a = sizes[i][0];
            if(sizes[i][0] < sizes[i][1]){
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = a;
            }
        }
        int max_w = 0;
        int max_h = 0;
        //전체의 최대값이 아닌 인접한 두수의 크기만 비교하게됨
        for (int i = 1; i < sizes.length; i++) {
            if (sizes[max_w][0] < sizes[i][0]) {
                max_w = i;
            }

            if (sizes[max_h][1] < sizes[i][1]) {
                max_h = i;
            }
        }
        
        int answer = sizes[max_w][0] * sizes[max_h][1];
        //1. 최대 * 최소
        //2. 가로의 최대와 세로의 최대 비교 -> 더 작은 명함의 가로 세로를 바꿔보기
        //3. 바꾼 후 가로 or 세로의 최대 구한 후 최대*최소
        //1번과 3번의 값 비교하기
        
//         //가로와 세로 중 더 큰값을 한쪽에 몰아준뒤에 가로세로의 최대값 곱하기
//         int w = sizes[max_w][0];
//         int h = sizes[max_h][1];
//         int answer = w * h;

//         if (w > h) {
//             sizes[max_h][1] = sizes[max_h][0];
//             sizes[max_h][0] = h;
//             for (int i = 1; i < sizes.length; i++) {
//                 if (h < sizes[i][1]) {
//                     max_h = i;
//                 }

//             }
            
//         } else {
//             sizes[max_w][1] = sizes[max_w][0];
//             sizes[max_w][0] = w;

//             for (int i = 1; i < sizes.length; i++) {
//                 if (w < sizes[i][0]) {
//                     max_w = i;
//                 }
//             }
//             if (answer > h * sizes[max_w][0]) {
//                 answer = h * sizes[max_w][0];
//             }
//         }

//         System.out.println(w);
//         System.out.println(h);

        return answer;
    }
}