package chapter3.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Camp camp = new Camp();

        // Optional 객체 활용
        Optional<Student> studentOptional = camp.getStudent();
        boolean flag = studentOptional.isPresent();
        if(flag) {
            Student student = studentOptional.get();
            String studentName = student.getName();
            System.out.println(studentName);

        } else {
            System.out.println("학생 데이터가 없습니다");
        }



        // 1. student = null
//        Student student = camp.getStudent();
//        System.out.println(student);
//
//        // 직접적인 널 처리방법
//        String studentName;
//        if (student != null){
//            studentName = student.getName();
//        }
//        else{
//            studentName = "등록된 학생이 아닙니다";
//        }

        // 2. NullPointerException
        // 이름이 아직 존재하지 않는데 호출하기에
        // --> uncheckException이라서 빨간줄은 안뜬다 - 대신 프로그램이 비정상적 종료
        // 그래서 직접 널 처리 해주기
//        String studentName = student.getName();
//        System.out.println(studentName);

    }
}
