
public class StudentDriver {

 public static void main(String[] args) throws Exception {
  // TODO Auto-generated method stub

 Address a=new Address("10 main st", "Freehold");
 Address b=new Address("11 South st", "Manalapan");
 Student s1= new Student("Joe", "Namath", 3.5, a);
 Student s2=new Student("Gill", "Phillips", 4.0, b);
 

 
 System.out.println(s1);
 System.out.println(s2);
 System.out.println("***********  Changes  ****************************");
 
 

 s2.setLastName("Bobby");
 s2.address.setCity("Manalapan");
 s2.setGPA(3.9);

//@Override
//public int compareTo(Student s){
 //return Double.valueOf(myGPA).compareTo(s.getGPA());
   // }
 
 try{
   s2.setGPA(3);  //Test -2 and then 5 and then 5/0 to prove that the try catch works
  }
 catch(IllegalStateException e){System.out.println(e);} 
 catch(IndexOutOfBoundsException f){System.out.println(f);} 
 catch (Exception x){System.out.println(x);}
 
 
 System.out.println(s1);
 System.out.println(s2);
  System.out.println("Joe's GPA vs Gill's GPA: " + s1.compareTo(s2));
 
 //Demonstrate the clone for student which is a substitute for a copy constructor
 /* 
  Student s3=s1.clone();
  s3.address.setCity("Orlando");
  System.out.println(s1);
  System.out.println(s3);
 */
 }

}
