import java.util.Arrays;
import java.util.GregorianCalendar;

import static java.util.Calendar.*;

//자연스러운 순서를 갖고 있는 배열의 정렬 만들기
class SortCalendar {
    public static void main(String[] args) {
        GregorianCalendar[] x = {
                new GregorianCalendar(2022, NOVEMBER, 1), // 2022년 11월 01일
                new GregorianCalendar(1963, OCTOBER, 18), // 1963년 10월 18일
                new GregorianCalendar(1985, APRIL, 15), // 1985년 04월 05일
        };

        Arrays.sort(x); // 배열 x를 정렬

        for (int i = 0; i < x.length; i++) {
            System.out.printf("%04d년 %02d월 %02d일\n",
                    x[i].get(YEAR),
                    x[i].get(MONTH) + 1,
                    x[i].get(DATE)
            );
        }
    }
}
