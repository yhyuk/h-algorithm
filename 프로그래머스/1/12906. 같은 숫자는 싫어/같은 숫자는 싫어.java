import java.util.*;

public class Solution {
    public Deque<Integer> solution(int []arr) {
        Deque<Integer> answer = new ArrayDeque<>();
        for (int i=0; i<arr.length; i++) {
            if (answer.isEmpty()) {
                answer.add(arr[i]);
            } else if (answer.peekLast() != arr[i]) {
                answer.add(arr[i]);
            }
        }
                
        return answer;
    }
}