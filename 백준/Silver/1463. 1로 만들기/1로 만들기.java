import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1000001];  //DP 배열 초기화
        dp[2] = 1;
        dp[3] = 1;
        for (int i = 4; i <= n; i++) {
            if (i % 6 == 0) {
                //6으로 나눠지면 3으로 나눠지는 경우, 2로 나눠지는 경우 둘다 확인
                dp[i] = Math.min(dp[i/3], Math.min(dp[i/2], dp[i-1])) + 1;
            } else if (i % 3 == 0) {
                //3으로 나눠지는 경우
                dp[i] = Math.min(dp[i/3], dp[i-1])+1;
            } else if (i % 2 == 0) {
                //2로 나눠지는 경우
                dp[i] = Math.min(dp[i/2], dp[i-1]) + 1;
            } else {
                //나눠지지 않는 경우
                dp[i] = dp[i-1] + 1;
            }
        }
        System.out.print(dp[n]);
    }
}
