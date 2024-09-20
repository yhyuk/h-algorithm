import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        
        int temp = 0;
        for (int i=people.length-1; i>=temp; i--) {
            if (people[i] + people[temp] <= limit) {
                answer++;
                temp++;
            } else {
                answer++;
            }
        }
        
        return answer;
    }
}