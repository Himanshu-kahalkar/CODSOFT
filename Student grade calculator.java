
import java.util.*;
class GradeCalculator
{
public static void main(String args[])
{
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter mathematics marks:");
     int n=sc.nextInt();
      System.out.println("Enter physics marks:");
     int n1=sc.nextInt();
      System.out.println("Enter chemistry marks:");
     int n2=sc.nextInt();
      System.out.println("Enter biology marks:");
     int n3=sc.nextInt();
      System.out.println("Enter English marks:");
     int n4=sc.nextInt();

 System.out.println("Mathematics:"+n);
 System.out.println("Physics:"+n1);
 System.out.println("Chemistry:"+n2); 
 System.out.println("Biology:"+n3); 
 System.out.println("English:"+n4); 
 int Total=n+n1+n2+n3+n4;
 System.out.println("Total:"+Total);
 double P = (Total*100)/500;
 System.out.println("Percentage:"+P+"%");
 if(P>=90)
 {
 System.out.println("Excellent"+" "+"A+");
 }
  else if(P>=80)
 {
 System.out.println("Very good"+" "+"A");
 }
   else if(P>=75)
 {
 System.out.println("Good"+" "+"B+");
 }
   else if(P>=55)
 {
 System.out.println("Passable"+" "+"c");
 }
    else
 {
 System.out.println("Failure");
  }
 }  
}
