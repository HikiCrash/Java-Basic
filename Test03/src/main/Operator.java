package main;

public class Operator {
    public static void main(String[] arts){
        int oprNum01 = 1;
        int oprNum02 = 1;
        int oprNum03 = 1;

        // 부호연산
        oprNum01 = -oprNum02; // 1 -> -1
        oprNum02 = +oprNum03; // 1 -> 1
        System.out.printf("%d , %d\n",
                oprNum01, oprNum02);

        // 산술연산
        oprNum01 = 10 / 3; // 3 나머지 버림
        oprNum02 = 10 % 3; // 1 나머지
        System.out.printf("%d , %d\n",
                oprNum01, oprNum02);

        // 증감연산
        --oprNum01; // 3 -> 2
        ++oprNum02; // 1 -> 2
        System.out.printf("%d , %d\n",
                oprNum01, oprNum02);

        // 관계 비교 연산자 (결과는 true/false)
        var result1 = oprNum01 == oprNum02; // ture
        var result2 = oprNum01 != oprNum02; // false
        var message = "oprNum01 != oprNum02 = %b".formatted(result2);
        // %b는 boolean에 결과 값이고 formatted는 값 끼워 넣기다.

        System.out.println(message); // false

        // 논리 연산 (조건 합치기)
        boolean result3 = result1 && result2; // AND
        boolean result4 = result1 || result2; // OR
        boolean result5 = !result1; // true -> false

        // 비트연산 (2진수로 계산)
        byte bit1 = 0b00001010; // 10
        byte bit2 = 0b00001100; // 12

        System.out.println(bit1 & bit2); // AND -> 둘다 1자리만 (8)
        System.out.println(bit1 | bit2); // OR -> 하나만 1이리도 (14)
        System.out.println(bit1 ^ bit2); // XOR -> 서로 다를 때만 1 (6)
        System.out.println(~bit1); // NOT -> 전부 뒤집기 (음수)

        byte bit3 = 0b0001; // 1
        System.out.println(bit3 << 2); // 왼쪽으로 2칸이동 -> 4
        System.out.println(8 >> 2); // 오른쪽으로 2칸이동 -> 2
    }
}
