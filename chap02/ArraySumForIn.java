public class ArraySumForIn {
    public static void main(String[] args) {
        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        double sum = 0;

        // 확장 for문을 'for-in문' 또는 'for-each'문이라고 부른다.
        for (double i: a) { // () 안의 콜론(:)은 '~의 안에 있는' 이라는 뜻이다. 읽을 때는 in 이라고 읽는다.
            sum += i;
        }

        System.out.println("모든 요소의 합은 " + sum    + "입니다.");
    }
}
