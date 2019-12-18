import java.io.*;
public class whileexample2

{
public static void main(String[]args)throws IOException
{
int i=1,n;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.print("Enter the n number");
n=Integer.parseInt(br.readLine());
while(i<=n)
{
System.out.println(i*3);
i++;
}
}
}