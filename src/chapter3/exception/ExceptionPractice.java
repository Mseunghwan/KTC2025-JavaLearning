package chapter3.exception;

public class ExceptionPractice {

    // 1. 언체크 예외 호출 예시
//    public void callUncheckedException() {
//        // try 내 예외를 발생시키는 로직
//        try{
//            // runtime exception 발생, 그럼 캐치 블럭안에 처리가능한지 확인하고,
//            // 그내용(sout) 대로 처리
//            if(true){
//                System.out.println("언체크 예외 발생");
//                throw new RuntimeException();
//            }
//        } catch(RuntimeException e) {
//            System.out.println("언체크 예외 처리");
//        }
//
//    }

    // 2. 체크 예외 호출 예시 --> 체크? 컴파일러가 예외 인 걸 체크해주는 예외(안하면 빨간줄 그임)
    public void callCheckedException() throws Exception {
        // 위에서 throws Exception은 위에서 처리하라고 던져주는 것
        if(true) {
            System.out.println("체크 예외 발생");
            throw new Exception();
        }
//        try{
//            if(true){
//                System.out.println("체크 예외 발생");
//                throw new Exception();
//            }
//        } catch (Exception e){
//            System.out.println("체크 예외 처리");
//        }
    }
}
