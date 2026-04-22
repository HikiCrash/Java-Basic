package main;
import school.Person;

public class Start {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "홍길동";
        person1.height = 160.0;
        person1.weight = 50.5;

        System.out.println(person1); // 객체 출력 (이상한 주소값 나옴)

        Person person2 = new Person("김하나");
        Person person3 = new Person("김두울", 150.0, 60.2);
    }
}
