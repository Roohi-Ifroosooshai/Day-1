import java.util.*; 
  
class Student {     
  private String name;     
  private int age;  
  private int id;

  public Student(String name, int age, int id) {         
    this.name = name;         
    this.age = age;
    this.id = id;
  }       

  public String getName() {         
    return name;     
  }       

  public int getAge() {         
    return age;     
  }       
  
  public int getId() {         
    return id;     
  } 
  
  
  public static Comparator<Student> nameComparator = new Comparator<Student>() {         
    public int compare(Student s1, Student s2) {             
      return (int) (s1.getName().compareTo(s2.getName()));         
    }     
  };

  public static Comparator<Student> ageComparator = new Comparator<Student>() {         
    public int compare(Student s1, Student s2) {             
      return (s2.getAge() > s1.getAge() ? -1 :                     
              (s2.getAge() == s1.getAge() ? 0 : 1));           
    }     
  };       
    
  
  public static Comparator<Student> idComparator = new Comparator<Student>() {         
    public int compare(Student s1, Student s2) {             
      return (s2.getId() > s1.getId() ? -1 :                     
              (s2.getId() == s1.getId() ? 0 : 1));           
    }     
  };
    
  public String toString() {         
    return " Name: " + this.name + ", age:" + this.age + ", Id: " + this.id;     
  } 
}


class StudentSorter {     
  ArrayList<Student> student = new ArrayList<>();       

  public StudentSorter(ArrayList<Student> student) {         
    this.student = student;     
  }      
  
  public ArrayList<Student> getSortedByName() {         
    Collections.sort(student, Student.nameComparator);         
    return student;     
  } 

  public ArrayList<Student> getSortedByAge() {         
    Collections.sort(student, Student.ageComparator);         
    return student;     
  }       
  
  public ArrayList<Student> getSortedById() {         
    Collections.sort(student, Student.idComparator);         
    return student;     
  } 

}


class Program1 { 
    public static void main(String arg[])throws Exception{
        
      StudentSorter studentSorter;       
         
               
        Student student1 = new Student("John", 26, 2211);         
        Student student2 = new Student("Mart", 23, 2295);         
        Student student3 = new Student("Hulk", 20, 8970);         
        Student student4 = new Student("Smith", 24, 7932);         
        ArrayList<Student> studentList = new ArrayList<>();         
        studentList.add(student1);         
        studentList.add(student2);         
        studentList.add(student3);         
        studentList.add(student4);         
        studentSorter = new StudentSorter(studentList);    
        
               
        System.out.println("Students Sorted by Name: ");         
        ArrayList<Student> sn = studentSorter.getSortedByName();         
        for (Student student : sn) {             
          System.out.println(student);         
        }   
               
        System.out.println("Students Sorted by Age: ");         
        ArrayList<Student> sa = studentSorter.getSortedByAge();         
        for (Student student : sa) {             
          System.out.println(student);         
        }     
           
        System.out.println("Students Sorted by Id: ");         
        ArrayList<Student> si = studentSorter.getSortedById();         
        for (Student student : si) {             
          System.out.println(student);         
        }    
     
    }
}
