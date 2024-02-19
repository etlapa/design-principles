package mx.edev.design_principles.least_knowledge.case2.solution1;

public class Notifier {

  public void notifyStudents(Course course, String announcement) {
    for (Student student : course.getStudents()) {
      student.receiveAnnouncement(announcement);
    }
  }
}
