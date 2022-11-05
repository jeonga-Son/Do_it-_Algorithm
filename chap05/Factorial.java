import java.util.Scanner;

class Factorial {
    // 음이 아닌 정수 n의 팩토리얼값을 반환
    static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        }
        else {
            return 1;
        }

        // 조건 연산자를 사용하면 한 줄로 구현할 수 있다.
        // => return (n > 0) ? n * factorial(n - 1) : 1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("■ 팩토리얼 값 반환하기를 시작합니다. ■");
        System.out.print("음이 아닌 정수 n의 값을 입력해주세요. : ");
        int x = stdIn.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
    }
}
