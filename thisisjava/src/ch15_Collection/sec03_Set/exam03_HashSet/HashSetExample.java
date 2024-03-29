package ch15_Collection.sec03_Set.exam03_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
  public static void main(String[] args) {
    // HashSet 컬렉션 생성
    Set<String> set = new HashSet<String>();

    // 객체추가
    set.add("Java");
    set.add("JDBC");
    set.add("JSP");
    set.add("Spring");

    // 객체를 하나씩 가져와서 처리
    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext()) { // hasNext() : 가져올 객체가 있으면 true, 없으면 false
      // 객체를 하나 가져오기
      String element = iterator.next(); // next(): 컬렉션에서 하나의 객체를 가져온다
      System.out.println(element);
      if (element.equals("JSP")) {
        // 가져온 객체를 컬렉션에서 제거
        iterator.remove();
      }
    }
    System.out.println();

    // 객체제거
    set.remove("JDBC");

    // 객체를 하나씩 가져와서 처리
    for (String element : set) {
      System.out.println(element);
    }
  }
}
