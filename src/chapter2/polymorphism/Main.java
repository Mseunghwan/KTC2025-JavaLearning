package chapter2.polymorphism;

public class Main {
    public static void main(String[] args) {
        // 다형성 활용
        // 한 가지 데이터 타입으로 두 가지 객체를 담는다

        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.exist();
        animal1.maksSound();

        animal2.exist();
        animal2.maksSound();

        // 업캐스팅 주의사항?
        // cat, dog의 고유기능 사용 X - scratch, wag 사용 불가
        // 다운캐스팅 해줘야
        Cat cat = (Cat) animal1;
        Dog dog = (Dog) animal2;

        cat.scratch();
        dog.wag();



        // 잘못된 다운캐스팅?
        //   Cat cat2 = (Cat) animal2; // animal2 = Dog; 이기에 X!!

        // 다운 캐스팅 시 instanceof 활용 방법
        if (animal2 instanceof Cat) {
            Cat cat2 = (Cat) animal2;
            cat2.scratch();
        } else {
            System.out.println("객체가 고양이가 아닙니다");
        }

        Animal[] animals = {new Cat(), new Dog(), new Cat()};
        System.out.println("::::");
        for (Animal animal : animals) {
            animal.maksSound();
        }


    }
}
