import java.util.*;
class Array
{
public static void main(String args[])
{
int a[]=new int[100];
int i,no;
Scanner sc=new Scanner(System.in);
System.out.print("Enter number:");
no=sc.nextInt();
System.out.print("Enter the array elements:"); 
for(i=0;i<no;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<no;i++)
{
System.out.print(a[i]);
}
}
}