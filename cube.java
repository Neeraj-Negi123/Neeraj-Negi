import java.util.*;
public class cube
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);

System.out.println("number :");
int number=a.nextInt();

for(int i=0;i<=number;i++)
{
System.out.println("the number is :"+i);
System.out.println("the cube of the number is :"+i*i*i);
}
}
}