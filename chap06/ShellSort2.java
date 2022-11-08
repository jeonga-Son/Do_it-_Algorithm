import java.util.Scanner;

// 멀리 떨어져 있는 요소를 교환하므로 안정적이지 않음.
class ShellSort2 {
    static void shellSort(int[] a, int n) {
        int h;

        // h의 초깃값을 구한다. 1부터 시작해 값을 3배하고 1을 더하면서 n을 넘지 않는 가장 큰 값을 h에 대입힌다.
        for (h = 1; h < n; h = h * 3 + 1);

        // 반복할 때마다 h값을 3으로 나눈다. 마지막에 h값은 1이 된다.
        for (; h > 0; h /= 3) {
            for (int i = h ; i < n; i++) {
                int j;
                int tmp = a[i];

                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    a[j + h] = a[j];
                }

                a[j + h] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("셸 정렬(버전2)");

        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        shellSort(x, nx); // 배열 x를 셸 정렬

        System.out.println("오름차순으로 정렬했습니다.");

        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
