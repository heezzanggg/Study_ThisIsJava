package ch11.test.exam08;

import java.io.IOException;

public class FilterWriterExample {
  public static void main(String[] args) {

    try (FileWriter fw = new FileWriter("file.txt")) {
      fw.write("java");
    } catch (Exception e) {
    }
  }
}