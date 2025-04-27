package chapter2.staticexample;

public class Person {

    // 인스턴스 변수
    String name;

    // static 변수
    static int population = 0;

    Person(){
        population++;
    }

    // 인스턴스 메서드
    void printName(){
        System.out.println(name);
    }

    // static 메서드
    static void printPopulation() {
        System.out.println("Population: " + population);
    }
}
