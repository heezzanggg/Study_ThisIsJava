package ch06_Class.sec07.exam02;

//필드초기화
public class Korean {
    // 국가는 동일한 값 =>필드 선언 시 초기값을 대입
    // 이름 주민등록번호는 객체마다 다른 값 => 생성자에서 초기화

    // 필드선언
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자선언
    public Korean(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

}
