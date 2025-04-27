package chapter2.clazz;

public class Person {

    // 1. 속성
    String name;
    int age;
    String address;

    // 2. 생성자
    // 기본 생성자 : Person(){}
    // 생성자의 특징 :
    // 1. 클래스와 이름이 같습니다.
    // 2. 반환 타입이 존재하지 않습니다.
    // 3. 여러 개가 존재할 수 있습니다(매개변수 다르게하면).
    public Person(String name, int age) {
        this.name = name; // 받은 name을 이 객체의 name에 담는다
        this.age = age; // 받은 age를 이 객체의 age에 담는다
    }

    // 3. 기능(메서드 부분)
    int sum(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }


    // 게터
    String getName() {
        return this.name;
    }

    // 세터
    void setAddress(String address) {
        this.address = address;
    }


}
