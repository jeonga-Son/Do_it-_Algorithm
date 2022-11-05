class A implements Comparable<A> { // Comparable 인터페이스 구현

    // 필드, 메서드 등

    public int compareTo(A c) { // compare To 메서드 구현
        // this 가 c보다 크면 양의 값 반환
        // this 가 c보다 작으면 음의 값 반환
        // this 가 c와 같으면 0 반환
    }

    public boolean equals(Object c) { // equals 메서드 구현
        // this 가 c와 같으면 true 반환
        // this 가 c와 같지 않으면 false 반환
    }
}
