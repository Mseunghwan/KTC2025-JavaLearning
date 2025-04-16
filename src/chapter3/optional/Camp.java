package chapter3.optional;

import java.util.Optional;

public class Camp {
    private Student student;

    public Optional<Student> getStudent() {
        // 이 코드 실행시점에 student가 널이면, optional이 널을 감싸서 리턴,
        // null이 아니면 데이터를 감싸서 optional 객체가 만들어져서 리턴
        // 그냥 상자 하나를 씌워서 보내는거
        return Optional.ofNullable(student);
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
