package mx.edev.design_principles.least_knowledge.case2.violation;

import java.util.Arrays;
import java.util.List;

public class Professor {
  private String name;
  private List<Course> courses;

  public Professor(String name) {
    this.name = name;
    this.courses = initialize();
  }

  private List<Course> initialize() {
    Student student1 = new Student("Ahsoka Tano");
    Student student2 = new Student("Luke Skywalker");
    Student student3 = new Student("Saesee Tiin");
    Student student4 = new Student("Ezra Bridger");
    Student student5 = new Student("Kanan Jarrus");
    Course course1 =
        new Course("Jedi Philosophy and Ethics", Arrays.asList(student1, student3, student5));
    Course course2 =
        new Course("Galactic History and Politics", Arrays.asList(student1, student2, student3));
    Course course3 =
        new Course("Force Lore and Mythology", Arrays.asList(student2, student3, student4));
    return Arrays.asList(course1, course2, course3);
  }

  public void announceExam(String courseName, String announcement) {
    for (Course course : courses) {
      if (course.getName().equals(courseName)) {
        // Violation: Directly accessing Student methods
        for (Student student : course.getStudents()) {
          student.receiveAnnouncement(announcement);
        }
      }
    }
  }
}
