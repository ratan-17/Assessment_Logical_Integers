import java.util.Scanner;

public class FindNum
{
// Prepare a Logic to find out 2nd  number in a set of number 
  // Let's Take a Number in Scanner
  // Example if you take 235 as number it should return 3
  // Likewise Logic you have written should get 2nd digit of any number


  void meth()
  {
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the Value :");
    int a=in.nextInt();
    int secNum=0;

    while(a>9)
    {
      secNum=a%10;
      a=a/10;

    }

    System.out.println("Second number of given number is : "+secNum);

    in.close();
  }
  public static void main(String[] args) 
  {
    {
      FindNum obj=new FindNum();
      obj.meth();
    }
  }

}
