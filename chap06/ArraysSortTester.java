import java.util.Arrays;
import java.util.Scanner;

class ArraysSortTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] :");
            x[i] = stdIn.nextInt();
        }

        // 기본 자료형의 배열을 정렬한다.
        // 이 sort 메서드의 내부에서 사용하는 알고리즘은 퀵 정렬 알고리즘을 개선한 것으로 안정적이지 않다.
        // 배열에 같은 값이 존재하면 같은 값 사이의 순서가 뒤바뀔 수도 있다.
        Arrays.sort(x); // 배열 x를 정렬

        System.out.println("오름차순으로 정렬했습니다.");

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
