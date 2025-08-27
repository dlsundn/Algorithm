import java.util .*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //1. participant와 completion 정렬
        //2. 값 비교 후 동일한 경우 completion과 participant 인덱스 +1
        //3. 동일하지 않은 경우 participant return
        List<String> arr = new ArrayList<>();
        List<String> arr1 = new ArrayList<>();

        for (int i = 0; i < participant.length; i++) {
            arr.add(participant[i]);
        }

        for (int i = 0; i < completion.length; i++) {
            arr1.add(completion[i]);
        }

        Collections.sort(arr);
        Collections.sort(arr1);
        for (int i = 0; i < arr1.size(); i++) {
            if (!arr.get(i).equals(arr1.get(i))) {

                return arr.get(i);
            }
        }

        return arr.get(arr.size() - 1);
    }
}