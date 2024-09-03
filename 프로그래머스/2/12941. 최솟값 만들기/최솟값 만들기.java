import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        // 큰수로 오름차순
        Arrays.sort(A);
        Arrays.sort(B);
    
        // A 는 순서대로
        // B 는 역순으로
        
        // 큰수 * 작은수 > 최소값
        // 큰수 * 큰수 > 최대값
        
        for (int i=0; i<A.length; i++) {
            answer += A[i] * B[B.length - i - 1];
        }
        

        return answer;
    }
}