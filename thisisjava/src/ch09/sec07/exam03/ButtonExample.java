package ch09.sec07.exam03;

import ch09.sec06.exam03.Button;

public class ButtonExample {
  public static void main(String[] args) {
    // Ok버튼 객체 생성
    Button btnOk = new Button();

    // Ok버튼 객체에 ClickListener 구현 객체 주입
    btnOk.setClickListener(new Button.ClickListener() {
      @Override
      public void onClick() {
        System.out.println("Ok버튼을 클릭했습니다.");
      }
    });

    // Ok버튼 클릭하기
    btnOk.click();

    // Cancel 버튼 객체 생성
    Button btnCancel = new Button();

    // Cancel 버튼 객체에 ClickListener구현 객체 주입
    btnCancel.setClickListener(new Button.ClickListener() {
      @Override
      public void onClick(){
        System.out.println("Cancel버튼을 클릭했습니다.");
      }
    })
  }
}