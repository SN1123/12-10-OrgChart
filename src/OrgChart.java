import java.util.*;

// main program to drive org chart
public class OrgChart
{
  public static void main (String[] args)
  {
    Manager manager1 = new Manager("Caeser", "Flickerman", 28, 20, 110, "Manager", "Devlopment");
    Manager manager2 = new Manager("Plutarch", "Heavensbee", 30, 20,110, "Manager", "Development");
    Employee emp1 = new Employee("Peeta", "Mellark", 19, 20, 94, "SR Developer");
    Employee emp2 = new Employee("Katniss", "Everdeen", 19, 20, 90, "JR Deveoper");
    Employee emp3 = new Employee("Finnick", "Odair", 31, 20, 86, "JR Developer");
    emp1.setManager(manager1);
    emp2.setManager(manager1);
    emp3.setManager(manager2);
    
    ArrayList<Employee> employees = manager1.getDirectReports();
    System.out.println(manager1.toString());
    for (int i=0; i < employees.size(); i++)
    {
      System.out.println("Employee: " + employees.get(i).toString());
    }
    ArrayList<Employee> employees2 = manager2.getDirectReports();
    System.out.println(manager2.toString());
    for (int j=0; j < employees2.size(); j++)
    {
      System.out.println("Employee: " + employees2.get(j).toString());
    }
  }
}
