// Super Class to represent a person
public class Person
{
  private String firstName;
  private String lastName;
  private int age;
  
  public Person (String name1, String name2, int old)
  {
    firstName = name1;
    lastName = name2;
    age = old;
  }
  public String getFirstName ()
  {
    return firstName;
  }
  public String getLastName ()
  {
    return lastName;
  }
  public int getAge ()
  {
    return age;
  }
  public String toString ()
  {
    return lastName + ", " + firstName;
  }
  public void recordBirthday ()
  {
    age++;
  }
  public boolean equals (Object obj)
  {
    if (obj instanceof Person)
    {
      Person other = (Person) obj;
      return firstName == other.getFirstName() && lastName == other.getLastName() && age == other.getAge();
    }
    else
    {
      return false;
    }
  }
}
