import java.io.*;
import java.util.*;
import java.lang.*;
public class Main
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Integer a;
System.out.println("Enter the number");
a=Integer.parseInt(br.readLine());
if(a % 2 == 0)
{
System.out.println("The number is even");
}
else
{
System.out.println("The number is odd");
}
}
}
