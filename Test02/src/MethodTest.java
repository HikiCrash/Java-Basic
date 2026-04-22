public class MethodTest {
    static int add(int num1, int num2){ // 두 숫자를 받아 더하는 메서드
        int result = num1 + num2;
        return result;
    }

    public static void main(String[] args){
        int num1 = 2, num2 = 3;
        int a = add(num1, num2); // 2 + 3
        System.out.println(a); // 5
    }
}

