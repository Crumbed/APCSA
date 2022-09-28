package objects;

public class Student
{
     private String name;
     private double gpa;

     public Student( String newName, double newGPA )
     {
          name = newName;
          gpa = newGPA;
     }

     public String getName()
     {
          return name;
     }

     public void setGpa(double newGpa) {
        gpa = newGpa;
     }

     public double getGpa(){
        return gpa;
     }
}