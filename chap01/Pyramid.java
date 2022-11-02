import java.util.Scanner;

class Pyramid {
    static void spira(int n) {
        for (int i = 0; i < n; i++) {
            // 스페이스
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }

            // 별
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("n의 값 : ");
        int n = stdIn.nextInt();
        spira(n);
    }
}
