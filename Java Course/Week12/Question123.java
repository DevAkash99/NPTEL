import java.util.*;
public class Question3{
  public static void main(String[] args){
      Scanner s1 = new Scanner(System.in);
       //Read your first name in string
	String fname=s1.nextLine();
    
    //Read  your last name in string
   String lname=s1.nextLine();
     //Read  rollnumber in integer
    int roll=s1.nextInt();
    //Read  1st subject mark in float
    double s1mark=s1.nextDouble();
    //Read  2nd subject mark in float
	double s2mark=s1.nextDouble();
    // find the avg mark in the subject
	double avg=(s1mark+s2mark)/2;
    //Print the record in the format: name+" "+rollnumber+" "+avg_mark  
System.out.print(fname+lname+" "+roll+" "+avg);
  }
}
