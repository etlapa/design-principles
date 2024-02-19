package mx.edev.design_principles.least_knowledge.case2.violation;

public class Main {
  public static void main(String[] args) {
    Professor professor = new Professor("Yoda");
    professor.announceExam(
        "Force Lore and Mythology",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
  }
}
