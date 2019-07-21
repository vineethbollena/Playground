import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int firstnum=num/100;
    int secondnum=(num/10)%10;
    int lastnum=(num%10);
    int reverse=(lastnum*100)+(secondnum*10)+(firstnum);
    System.out.println(reverse);
  }
}