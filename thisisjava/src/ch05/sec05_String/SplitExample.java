package ch05.sec05_String;

public class SplitExample {
  public static void main(String[] args) {
    String board = "1,자바 학습,참조타입 String을 학습합니다.,홍길동";

    // 문자열 분리
    String[] tokens = board.split(","); // "," 기준으로 문자열 분리해서 배열에 담기

    // 인덱스별로 읽기
    System.out.println("===========인덱스별로 읽기===========");

    System.out.println("번호: " + tokens[0]);
    System.out.println("제목: " + tokens[1]);
    System.out.println("내용: " + tokens[2]);
    System.out.println("성명: " + tokens[3]);

    // for문 이용해서 읽기
    System.out.println("===========for문 이용해서 읽기===========");

    for (int i = 0; i < tokens.length; i++) {
      System.out.println(tokens[i]);
    }

  }

}

// split()메소드 이용하면 문자열로 구성된 배열(array)얻을 수 있음
