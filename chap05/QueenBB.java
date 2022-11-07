class QueenBB {
    static boolean[] flag = new boolean[8]; // 각 행에 퀸이 이미 배치되었는가?
    static int[] pos = new int[8]; // 각 열의 퀸의 위치
    
    // 각 열에 있는 퀸의 위치를 출력
    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }
    
    // i열의 알맞은 위치에 퀸을 배치
    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            if (flag[j] == false) { // j행에 퀸을 아직 배치하지 않음
                pos[i] = j; // 퀸을 j행에 배치
                if (i == 7) { // 모든 열에 배치
                    print();
                }
                else {
                    flag[j] = true;
                    set(i + 1);
                    flag[j] = false; // set(i + 1) 메서드 실행 끝난 후 퀸을 j 행에서 제거하기 위해 false 대입.
                                     // 이렇게 필요없는 분기를 없애 불필요한 조합을 줄이는 방법을 한정조작이라고 하고,
                                     // 분기조작과 한정조작을 조합하여 문제 풀어나가는 방법을 분기 한정법이라고 한다.
                }
            }
        }
    }
    
    public static void main(String[] args) {
        set(0);
    }
}
