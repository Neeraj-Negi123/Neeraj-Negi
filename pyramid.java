import java.util.*;
public class pyramid
{
    public static void main(String args[]) 
    {
        Scanner a=new Scanner(System.in);

	System.out.println("enter the row :");
	int row=a.nextInt();

        for(int i=1;i<=row;i++)
            {
                for(int j=row;j>=1;j--)
                {
                    if(j>i)
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print(" *");
                    }
                }
            	System.out.println( );  
          }
    }
}