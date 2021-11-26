import java.util.*;
public class faboni
{
public static void main(String[] args)
{
Scanner km=new Scanner(System.in);

System.out.println("enter the number");
int n=km.nextInt();

int first=0;
int second=1;
for(int i=1;i<=n;i++)
{
System.out.println(first);
int third=first+second;
first=second;
second=third;
}
}
}