package ch15_Collection.sec06_LIFOandFIFO.exam02_Queue;

public class Message {
  public String command;
  public String to;

  public Message(String command, String to) {
    this.command = command;
    this.to = to;
  }
}
