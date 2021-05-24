


import java.util.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

class Employee { 
  //@Required  
  private String firstName;
  private String lastName;
  private int age;  
  private String company;
  private int experience;

  public Employee(String firstName, String lastName, int age, String company, int experience) {         
    this.firstName = firstName;    
    this.lastName = lastName;
    this.age = age;
    this.company = company;
    this.experience = experience;
  }       

  public String getFirstName() {         
    return firstName;     
  }      
  
  public String getLastName() {         
    return lastName;     
  }       

  public int getAge() {         
    return age;     
  }       
  
  public String getCompany() {         
    return company;     
  } 
  
  public int getExperience() {         
    return experience;     
  } 
  
  public String toString() {         
    return " FirstName: " + this.firstName + ", LastName:" + this.lastName + ", Age:" + this.age + ", Company: " + this.company + ", Experience:" + this.experience ;     
  } 
}


public class Program4 {
    public static void main(String[] args) throws Exception
    {
        Employee e1 = new Employee("John", "smith", 26, "IBM", 8);         
        Employee e2 = new Employee("Bob", "Mary", 34, "Wipro", 2);  
        
        Set<Employee> employee1= new HashSet<Employee>();
        employee1.addAll(Arrays.asList(e1));
        
        Set<Employee> employee2= new HashSet<Employee>();
        employee2.addAll(Arrays.asList(e2));
     
    	System.out.println("Employee 1: " +employee1);
    	System.out.println("Employee 2: " +employee2);
    
    }
}
