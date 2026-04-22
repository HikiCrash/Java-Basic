package main;

// java.util 안에 있는 Scanner 클래스 가져오기
import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args){

        // Scanner 생성
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine(); // 한 줄 문자열 입력 받기 (enter까지)
        System.out.println(name); // 입력한 이름 출력

        System.out.println("score : "); // 점수 입력 안내

        String strScore = sc.nextLine(); // 점수를 문자열로 받기

        // 문자열 -> 정수로 변환
        int score = Integer.parseInt(strScore);

        if (score >= 90){
            System.out.println("합격:우수");
        } else if (score >= 80){
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }

        int rank = Integer.parseInt(sc.nextLine()); // 순위 입력 -> 정수로 변환

        String medal; // 메달 이름 저장 변수

        switch (rank){
            case 1: medal = "금";break;
            case 2: medal = "은";break;
            case 3: medal = "동";break;
            default: // else
                medal = "참가상";
                System.out.println("순위권 외");
                break;
        }
        System.out.println(medal);

        medal = switch (rank){
            case 1 -> medal = "금";
            case 2 -> medal = "은";
            case 3 -> medal = "동";
            default -> {
                System.out.println("순위권 외");
                yield "참가상"; // 스위치 안에서 값 반환
            }
        };
        System.out.println(medal); // 메달 출력

        // 배열 생성
        String[] students = new String[3];

        for (int i = 0; i < students.length; i++){ // 3번 반복 0~2
            students[i] = sc.nextLine(); // 학생 이름 입력 후 저장
        }

        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]); // 학생 이름 출력
        }

        // 향상된 for문 (foreach) → 하나씩 꺼내기
        for (var stu : students){ // 배열에서 하나씩 꺼냄
            System.out.println(stu); // 출력
        }

        int energy = Integer.parseInt(sc.nextLine());

        // while -> 조건이 true일 때만 반복
        while (energy > 0){
            System.out.println("에너지" + energy);
            energy--;
        }

        // do - while 무조건 1번 실행 후 조건 체크
        do{
            System.out.println("에너지" + energy);
            energy--;
        } while (energy > 0); //조건 검사

        sc.close(); // Scanner 닫기
    }
}
