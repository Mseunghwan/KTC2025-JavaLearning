package chapter2.staticexample;

public class Main {
    public static void main(String[] args) {

        // 클래스 멤버 - 보통 static 붙은 애들보고 클래스 멤버라 함
        // static 변수, 메서드 활용
        System.out.println("Static 변수 활용 : " + Person.population);
        Person.printPopulation();

        // 인스턴스 멤버 활용
        Person p1 = new Person();
        Person p2 = new Person();

        // 인스턴스 변수 활용
        p1.name = "hey";
        p2.name = "steve";

        // 인스턴스 메서드 활용
        p1.printName();
        p2.printName();

        Person.printPopulation();
    }
}
