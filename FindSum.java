import java.util.Scanner;
public class FindSum
{
// Prepare a Logic to Findout the Sum of Prime Placed Digits
  // Example if we take 34578 as a Number we should consider 3+5+8=16 it should print 16 as Answer
  // LikeWise Prepare a Logic to find out sum at prime placed Integer
  // Take Number Using Scanner

  void meth()
  {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the value :");
      int a=in.nextInt();
      int sum=0;

      while(a!=0)
      {
        int rem=a%10;
        sum+=rem;
        //sum=sum+rem;
        a=a/10;
      }
      
      System.out.println("The sum of digits is : "+ sum);
      in.close();
  }

  public static void main(String[] args) 
  {
      new FindSum().meth();  
  }
}
