// class to represent an emplayee - inherits Person
public class Employee extends Person
{
  private double hourlyWage;
  private int hoursWorked;
  private String jobTitle;
  private Manager manager;
  
  public Employee (String firstName, String lastName, int age, double wagePerHour, int hours, String job)
  {
    super(firstName, lastName, age);
    hoursWorked = hours;
    hourlyWage = wagePerHour;
    jobTitle = job;
  }
  public double getWage ()
  {
    return hourlyWage;
  }
  public int getHours ()
  {
    return hoursWorked;
  }
  public double getWeeklySalary ()
  {
    return hoursWorked*hourlyWage;
  }
  public double getYearlySalary ()
  {
    return getWeeklySalary() * 52;
  }
  public String getJobTitle ()
  {
    return jobTitle;
  }
  public String toString ()
  {
    return super.toString()  + " " + jobTitle + "@ " + getYearlySalary();
  }
  public Manager getManager ()
  {
    return manager;
  }
  public void setWage (double newWage)
  {
    hourlyWage = newWage;
  }
  public void setHours (int h)
  {
    hoursWorked = h;
  }
  public void setJobTitle (String title)
  {
    jobTitle = title;
  }
  public void giveRaise ()
  {
    hourlyWage++;
  }
  public void setManager (Manager newManager)
  {
    if (manager != null)
    {
      //remove employee from manager's list
    }
    //add employee to new manager
  }
}
