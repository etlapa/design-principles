package mx.edev.design_principles.least_knowledge.case2.solution2;

public interface AnnouncementSubject {
  void registerObserver(Student observer);

  void unregisterObserver(Student observer);

  void notifyObservers(String announcement);
}
