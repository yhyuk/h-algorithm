import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 편의점 거스름돈 주기
        // 동전 가치 (단위: 센트)
        // 쿼터: 25, 다임: 10, 니켈: 5, 페니: 1
        // 동전 개수 = 남은 금액 / 동저 가치
        // 남은 금액 = 남은 금액 % 동전 가치

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int C = sc.nextInt(); // 거스름돈 (센트)

            // 1. 쿼터 (25센트)
            int quarter = C / 25; // 쿼터 개수
            C = C % 25; // 남은 금액

            // 2. 다임 (10센트)
            int dime = C / 10; // 다임 개수
            C = C % 10; // 남은 금액

            // 3. 니켈 (5센트)
            int nickel = C / 5; // 니켈 개수
            C = C % 5;  // 남은 금액

            // 4. 페니 (1센트)
            int penny = C; // 페니 개수 (= 남은 금액)

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}
