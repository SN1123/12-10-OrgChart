import java.util.*
// class to represent a manager - inherits Emplyee
public class Manager extends Employee
{
  private ArrayList<Employee> directReports = new ArrayList<Employee>();
  private String department;
  
  public String Manager ()
  {
    return department;
  }
  public ArrayList<Employee> getDirectReports ()
  {
    return directReports;
  }
  public String toString ()
  {
    return "Manager :" + super.toString()
  }
  public void addDirectReport (Employee employee)
  {
    directReports.add(employee);
  }
}
