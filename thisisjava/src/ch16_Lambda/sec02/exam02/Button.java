package ch16_Lambda.sec02.exam02;

public class Button {
  //정적멤버 인터페이스
  @FunctionalInterface
  public static interface ClickListener{
    //추상메소드
    void onClick();
  }

  //필드
  private ClickListener clickListener;
  //메소드
  public void setClickListener(ClickListener clickListener){
    this.clickListener = clickListener;
  }
  public void click(){
    this.clickListener.onClick();
  }
}
