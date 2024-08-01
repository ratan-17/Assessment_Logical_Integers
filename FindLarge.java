import java.util.Scanner;

public class FindLarge
{
// prepare a Logic to findout Large digit in given Number
  // If Number is 1782 The Largest Digit is 8 You should prepare logic to print that Number
  // Take Number By using Scanner

  void meth()
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the value :");
    int a=in.nextInt();
    int large=0;
     while(a!=0)
    {
      int rem=a%10;
      

      if(large<rem)
      {
        large=rem;
      }
      a=a/10;
    }
    System.out.println("Largest Value is : "+large);

    in.close();
    }

  public static void main(String[] args) 
  {
    new FindLarge().meth();
  }

}
