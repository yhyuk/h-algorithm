import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        long[] S = new long[suNo + 1]; // 합배열

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i=1; i<=suNo; i++) {
            // 합배열
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int q=0; q<quizNo; q++) {
            // 질의 범위
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());

            // 구간합
            System.out.println(S[j] - S[i - 1]);
        }

    }
}
