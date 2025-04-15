package chapter3.exception;


public class Main {
public static void main(String[] args) {
    // 3. 언체크 예외처리 - 상위 메서드에서
    ExceptionPractice exceptionPractice = new ExceptionPractice();
//    try{
//        exceptionPractice.callUncheckedException();
//    } catch ( RuntimeException e ){
//        System.out.println("언체크 예외 처리");
//    }
//
    // 4. 체크 예외 호출 - throw로 넘겨받았기에
    try {
        exceptionPractice.callCheckedException();
    } catch(Exception e) {
        System.out.println("체크 예외 처리");
    }

    System.out.println("프로그램 종료");
}
}
