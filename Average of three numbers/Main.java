import java.util.*;
class Main 
{
	public static void main (String[] args) 
    {
		Scanner in=new Scanner(System.in);
      int num1=in.nextInt();
      int num2=in.nextInt();
      int num3=in.nextInt();
      int sum=num1+num2+num3;
      int avg=sum/3;
      System.out.println(avg);
    }
}