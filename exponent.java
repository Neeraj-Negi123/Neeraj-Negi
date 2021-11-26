import java.util.*;
public class exponent
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);

System.out.println("enter 1st number :");
Double x=a.nextDouble();

System.out.println("enter 2nd number :");
Double y=a.nextDouble();

Double z=Math.pow(x,y);
System.out.println("the exponential is :"+z);
}
}