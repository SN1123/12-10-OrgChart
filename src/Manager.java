import java.util.*;
// class to represent a manager - inherits Emplyee
public class Manager extends Employee
{
  private ArrayList<Employee> directReports = new ArrayList<Employee>();
  private String department;
  
  public Manager (String firstName, String lastName, int age, double wagePerHour, int hours, String job, String Dept)
  {
    super(firstName, lastName, age, wagePerHour, hours, job);
    department = Dept;
  }
  public String getDepartment ()
  {
    return department;
  }
  public ArrayList<Employee> getDirectReports ()
  {
    return directReports;
  }
  public String toString ()
  {
    return "Manager :" + super.toString();
  }
  public void addDirectReport (Employee employee)
  {
    directReports.add(employee);
  }
  public void removeDirectReport (Employee employee)
  {
    directReports.remove(employee);
  }
  public void setDepartment (String dept)
  {
    department = dept;
  }
  public boolean equals (Object obj)
  {
    if (obj instanceof Manager)
    {
      Manager other = (Manager) obj;
      return directReports == other.getDirectReports() && department == other.getDepartment();
    }
    else
    {
      return false;
    }
  }
}
