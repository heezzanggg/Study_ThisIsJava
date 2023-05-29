package ch16_Lambda.sec05.exam03;

public class Member {
  private String id;
  private String name;

  public Member(String id, String name){
    this.id = id;
    this.name = name;
    System.out.println("Member(Stirng id, String name)");
  }

  public Member(String id){
    this.id = id;
    System.out.println("Member(String id)");
  }

  @Override
  public String toString() {
    String info = "{id: "+id+", name: "+name+"}";
    return info;
  }


}
