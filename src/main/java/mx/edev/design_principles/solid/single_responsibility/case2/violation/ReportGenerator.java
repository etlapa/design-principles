package mx.edev.design_principles.solid.single_responsibility.case2.violation;

// Issue: Violation of SRP - Class has multiple responsibilities

class ReportGenerator {

  public void generateReport(String data) {
    // Code to generate report
  }

  public void saveReportToFile(String report) {
    // Code to save report to file
  }

  public void sendReportByEmail(String report) {
    // Code to send report by email
  }
}
