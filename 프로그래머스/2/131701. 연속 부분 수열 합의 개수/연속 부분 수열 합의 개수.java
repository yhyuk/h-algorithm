import java.util.*;

class Solution {
    public int solution(int[] elements) {
        // elements의 2배 크기의 배열 생성
        int[] newElements = new int[elements.length * 2];
        
        // newElements의 i와 i + elements.length 위치에 elements[i] 저장
        for (int i=0; i<elements.length; i++) {
            newElements[i] = elements[i];
            newElements[i + elements.length] = elements[i];
        }
        
        // 중복 제거 Set
        Set<Integer> set = new HashSet<>();
        
        // 부분 수열 합
        for (int i=0; i<elements.length; i++) {
            for (int j=0; j<elements.length; j++) {
                // 새 배열에서 j부터 j+i-1 까지 부분 배열의 합을 구하고 Set에 추가
                set.add(Arrays.stream(newElements, j, j+i).sum());
            }
        }
        
        return set.size();
    }
}