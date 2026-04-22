public class MethodTest {
    static int add(int num1, int num2){ // 두 숫자를 받아 더하는 메서드
        int result = num1 + num2;
        return result;
    }

    public static void main(String[] args) {
        int num1 = 2, num2 = 3;
        int a = add(num1, num2); // 2 + 3
        System.out.println(a); // 5

        MethodTest obj = new MethodTest(); // 객체 생성
        obj.test(); // test() 실행
    }

    int Add1(int a, int b){
        return a+b;
    }

    void Add2(int a, int b){
        System.out.println(a+b);
    }

    int Add3(){
        int a = 1;
        int b = 2;
        return (a+b);
    }

    void Add4(){
        int a = 1;
        int b = 2;
        System.out.println(a+b);
    }

    public void test(){
        System.out.println(Add1(1, 2));
        Add2(1, 2);
        System.out.println(Add3());
        Add4();
    }
}

