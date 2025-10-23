import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    	public static void main(String[] args) throws IOException {
		/**
		 * 풀이 전략
		 * - 마지막 날을 제외하고는 하루에 A-B 미터씩 올라간다.
		 * - 마지막 날에는 A미터를 올라가서 V에 도달하면 끝
		 * - 따라서 (V-B) 높이에 도달하는 데 필요한 날짜를 계산
		 * - (V-B) / (A-B) --> 올림처리 !
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 높이
		int B = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 높이
		int V = Integer.parseInt(st.nextToken()); // 나무 높이

		int days = (V - B + A - B - 1) / (A - B);

		System.out.println(days);
	}
}