import java.util.*;
public class leap
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);

System.out.println("enter year :");
int year=a.nextInt();

if(year%4==0)
{
System.out.print("the year is leap year");
}
else
{
System.out.print("the year is not leap year");
}
}
}