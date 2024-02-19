package mx.edev.design_principles.least_knowledge.case2.solution2;

public class Student {
  private String name;

  public Student(String name) {
    this.name = name;
  }

  public void receiveAnnouncement(String announcement) {
    System.out.println("Student [" + name + "] receiveAnnouncement: " + announcement);
  }
}
