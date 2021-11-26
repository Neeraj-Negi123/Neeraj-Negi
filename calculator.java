import java.util.*;
public class calculator
{
public static void main(String args[])
{
int num1,num2,result;
Scanner name=new Scanner(System.in);

System.out.println("enter 1st number :");
num1=name.nextInt();

System.out.println("enter 2nd number :");
num2=name.nextInt();

System.out.println("enter operator :");
char  c=name.next().charAt(0);

switch(c)
{

case'+':
result=num1+num2;
System.out.println("addition is :"+result);
break;

case'-':
result=num1-num2;
System.out.println("subtraction is :"+result);
break;

case'*':
result=num1*num2;
System.out.println("multiplication is :"+result);
break;

case'/':
result=num1/num2;
System.out.println("the division is :"+result);
break;

default:
System.out.println("invalid operators");
}
}
}