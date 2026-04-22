package main;

public class Variable {
    public static void main(String[] args){
        int binVal = 0b1111; // 2진수로 쓴 1111
        int octVal = 017; // 8진수로 쓴 17
        int decVal = 15; // 10진수
        int hexVal = 0xF; // 16진수로 쓴 F
        // 전부 10진수의 15이다.

        System.out.printf("%d %d %d %d \n",
                binVal, octVal, decVal, hexVal); // 모두 15

        char grade_1 = 49;
        short grade_2 = 49;

        System.out.println(grade_1); // '1'
        System.out.println(grade_2); // 49

        boolean isPass = true;
        if (isPass == false){
            System.out.println("꺼져!");
        }
        else {
            System.out.println("어서오세");
        }

        // 지역변수만 가능.
        var age = 21; // 자동 int
        var height = 165.5; // 자동 double
        System.out.println(age); // 21
        System.out.println(height); // 165.5

        final int MAX_NUM = 100; // final = 한 번 정하면 못 바꿈 (상수)
        final int MIN_NUM; // 선언만 하고 나중에 값 넣기 가능
        // MAX_NUM = 10; -> 에러 (이미 값이 있음)
        // MIN_NUM = 0; (가능함.)
        // System.out.println(MIN_NUM); -> 값 넣기 전 에러

        int a = 32;
        // int b = 10000000000000000; -> int 범위 초과 에러
        long b = 10_000_000_000_000_000L; // 큰 숫자는 long + L 붙여야함
        // float c = 32.6; -> 에러 (double로 인식)
        float c = 32.6f; // float는 f를 붙여야 함
        double d = 32.6; // double은 기본 실수 타입

        b = a; // 작 -> 큰 (자동 변환)
        a = (int)b; // 큰 -> 작 (강제 변환 필요)

        c = a; // int -> float (자동 변환)
        b = (int)c; // float -> int (소수점 삭제)

        double e = a + c; // int + float -> 자동으로 double로 계산
        // double e = (float)a + c; -> a를 float으로 바꿔 계산
        // double e = (double)((float)a + c); -> 더 명확하게 계산

        b = (long)(a + c); // 계산 후 long으로 변환
        b = a + (int)c; // c를 int로 바꿔서 더함 (소수점 버림)
    }
}
