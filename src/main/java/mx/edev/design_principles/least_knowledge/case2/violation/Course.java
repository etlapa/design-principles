package mx.edev.design_principles.least_knowledge.case2.violation;

import java.util.List;

public class Course {
  private String name;
  private List<Student> students;

  public Course(String name, List<Student> students) {
    this.name = name;
    this.students = students;
  }

  public String getName() {
    return name;
  }

  public List<Student> getStudents() {
    return students;
  }
}
