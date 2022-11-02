import java.util.Scanner;

public class Triangle {

    public static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public static void triangleLU(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = (n-(i-1)); j >= 1; j-- ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleRU(int n) {
        for (int i = 0; i < n; i++) {
            // 스페이스
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // 별
            for (int j = n; j > i; j-- ) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void triangleRB(int n) {
        for (int i = 0; i < n; i++) {

            //스페이스
            for (int j = n; j > i + 1; j-- ) {
                System.out.print(" ");
            }

            // 별
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("이등변삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까? : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        System.out.println();
        triangleLB(n); // 왼쪽 아래가 직각인 이등변삼각형

        System.out.println();
        triangleLU(n); // 왼쪽 위가 직각인 이등변삼각형

        System.out.println();
        triangleRU(n); // 오른족 위가 직각인 이등변삼각형

        System.out.println();
        triangleRB(n); // 오른족 아래가 직각인 이등변삼각형
    }
}
