 
import java.util.Scanner;

public class FindOdd{
// Prepare a Logic to print odd didgit in anumber
  // Example if we have taken Number 122456 it should return digits which are in odd position in this number it should retrun odd placed values 
  // 1 
  // 2
  // 5
  // This will be the output since they are in odd positions

  void meth()
  {
     Scanner in=new Scanner(System.in); 
     System.out.println("Enter the number : ");
     int a=in.nextInt();

     while(a!=0)
     {
      int rem=a%10;

      if (rem%2==1)
      {
        System.out.println(rem);
      }
      a=a/10;
     }

  }
  public static void main(String[] args)
   {
     new FindOdd().meth();
  }
  
}
