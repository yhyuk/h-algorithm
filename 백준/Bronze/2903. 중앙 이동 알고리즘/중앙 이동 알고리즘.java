import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 한 변의 점 개수 계산
        int side = (int) Math.pow(2, N) + 1;

        // 전체 점의 개수 = 한 변 제곱
        int total = side * side;

        System.out.println(total);
    }
}