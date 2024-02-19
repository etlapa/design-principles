package mx.edev.design_principles.least_knowledge.case2.solution1;

import java.util.List;

public class Course {
  private final String name;
  private List<Student> students;

  public Course(String name, List<Student> students) {
    this.name = name;
    this.students = students;
  }

  public List<Student> getStudents() {
    return students;
  }

  public String getName() {
    return name;
  }
}
