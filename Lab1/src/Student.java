
public class Student implements Cloneable,Comparable<Student> {
 
 String firstName;
 String lastName;
 double GPA;
 Address address;
 
 public Student()
 {
  firstName="John";
  lastName="Doe";
  GPA=0.0;
 }
 public Student(String f,String l,double g,Address a)
 {
  firstName=f;
  lastName=l;
  GPA=g;
  address=a;
  
 }
 
 public Student(Student s)
 { //copy constructor
  firstName=s.firstName;
  lastName=s.lastName;
  GPA=s.GPA;
  //address=s.address;  //references the same address as the original//Incorrect
  address=new Address(s.address.streetAddress,s.address.city); //Correct
  address=s.address.clone();//Correct Once the clone method is correctly implemented (Coded)
 }
 public void setLastName(String l)
 {
  lastName=l;
 }

 
 
    @Override
   public int compareTo(Student other) {
        
    Student filler = (Student) other;
    // if (filler == null) {
     // return 1; } 
        //if (this.getGPA() > filler.getGPA()){
  //  return 1;} 
        
  if (this.getGPA() < filler.getGPA()){
     return -1;}
 
   else {
     return 0;
  }
   }
    
    

 public void setGPA(double g) throws Exception
 {  if(g<0)
   throw new IllegalStateException("GPA must be greater than 0");
  else if(g>4)
   throw new IndexOutOfBoundsException("Number must be less than <=4");
  GPA=g;
}
 public double getGPA()
 { 
   
   return GPA;}
 
 public String toString()
 {
  String result="";
  result+="first name: "+firstName;
  result+="\nlast name: "+lastName;
  result+="\nGPA: "+GPA;
  result+="\nAddress: "+address;
  return result;
  
 }
 public Student clone()
 {
  return new Student (firstName, this.lastName, this.GPA, this.address.clone());
 }

}
