
import java.util.*;

class Employee
{
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String company;
    private final int experience;
 
    private Employee(EmployeeBuilder e) {
        this.firstName = e.firstName;
        this.lastName = e.lastName;
        this.age = e.age;
        this.company = e.company;
        this.experience = e.experience;
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
        return this.firstName+", "+this.lastName+", "+this.age+", "+this.company+", "+this.experience;
    }
 
    static class EmployeeBuilder 
    {
        private final String firstName;
        private String lastName;
        private int age;
        private String company;
        private int experience;
 
        public EmployeeBuilder(String firstName) {
            this.firstName = firstName;
        }
        public EmployeeBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public EmployeeBuilder age(int age) {
            this.age = age;
            return this;
        }
        public EmployeeBuilder company(String company) {
            this.company = company;
            return this;
        }
        public EmployeeBuilder experience(int experience) {
            this.experience = experience;
            return this;
        }
        
        public Employee build() {
            Employee employee =  new Employee(this);
            return employee;
        }
    }
}

public class Program4{
    public static void main(String[] args) {
        
        Employee e1 = new Employee.EmployeeBuilder("Lokesh")
        .age(30)
        .build();
        
        Set<Employee> employee1= new HashSet<Employee>();
        employee1.addAll(Arrays.asList(e1));
        
        System.out.println("Employee1: " +employee1);
     
        Employee e2 = new Employee.EmployeeBuilder("Jack")
        .company("Wipro")
        .experience(6)
        .build();
        
        Set<Employee> employee2= new HashSet<Employee>();
        employee2.addAll(Arrays.asList(e2));
     
        System.out.println("Employee2: " +employee2);
    }
}
