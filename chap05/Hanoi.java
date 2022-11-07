import java.util.Scanner;

class Hanoi {
    // no 개의 원반을 x번 기둥에서 y번 기둥으로 옮김
    static void move(int no, int x, int y) {
        if (no > 1) {
            move(no - 1, x, 6 -x -y); // 기둥 번호 정수 1, 2, 3의 합 = 6. 따라서 목표기둥이 어느 기둥이더라도 중간 기둥은 6 - x - y로 구할 수 있음.
        }

        System.out.printf("원반[%d]을(를) %d번 기둥에서 %d번 기둥으로 옮김\n", no, x, y);

        if (no > 1) {
            move(no - 1, 6 - x - y, y);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 개수 : ");
        int n = stdIn.nextInt();

        move(n, 1, 3); // 1번 기둥에 쌓인 n개의 원반을 3번 기둥으로 옮김.
    }
}
