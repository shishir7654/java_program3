import java.io.*;
public class whileexample1
{
public static void main(String[] args)throws IOException
{
 int i=0, n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the of n:");
n=Integer.parseInt(br.readLine());
while( i<=n)   
{
System.out.println(i);
i++;
}
}
}