package chapter2.clazz;

public class Main {
    public static void main(String[] args) {
        // 객체 생성
        Person personA = new Person("seunghwan", 3);
        Person personB = new Person("seunghwan", 5);
//
//        System.out.println("설정 전 personA 이름: " + personA.name);
//        System.out.println("설정 전 personB 이름: " + personB.name);
//
//        // 속성에 직접 접근
//        personA.name = "Mseunghwan";
//        personB.name = "Steve";
//
//        System.out.println("설정 후 personA 이름: " + personA.name);
//        System.out.println("설정 후 personB 이름: " + personB.name);
        int val = personA.sum(1, 3);
        System.out.println(val);

        // 게터 활용
        System.out.println(personA.getName());

        // 세터 활용
        personA.setAddress("광진구");
        System.out.println(personA.address);
    }
}
