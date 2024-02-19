package mx.edev.design_principles.solid.single_responsibility.case1.solution;

/** Class responsible for saving data to a file */
public class FileSaver {
  public void saveToFile(String name, double salary) {
    // Code to save employee data to a file
    System.out.println("Saving employee data to file: " + name + ", " + salary);
  }
}
