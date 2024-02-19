package mx.edev.design_principles.least_knowledge.case2.solution2;

import java.util.List;

public class Course implements AnnouncementSubject {
  private String name;
  private List<Student> students;

  public Course(String name, List<Student> students) {
    this.name = name;
    this.students = students;
  }

  public String getName() {
    return name;
  }

  @Override
  public void registerObserver(Student observer) {
    students.add(observer);
  }

  @Override
  public void unregisterObserver(Student observer) {
    students.remove(observer);
  }

  @Override
  public void notifyObservers(String announcement) {
    for (Student observer : students) {
      observer.receiveAnnouncement(announcement);
    }
  }
}
