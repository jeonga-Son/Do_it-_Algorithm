import java.util.Scanner;

class JudgeABC2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int n = stdIn.nextInt();

        if (n == 1)
            System.out.println("Ａ");
        else if (n == 2)
            System.out.println("Ｂ");
        else if (n == 3)
            System.out.println("Ｃ");
    } // 1, 2, 3 이외의 값이면 아무것도 출력하지 않는다.
}