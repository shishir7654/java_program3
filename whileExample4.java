import java.io.*;
 public class whileExample4
{
	public static void main (String[]args)throws IOException
	{
	  int i=2, n,m=0,flag=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter the number to check prime:");
	n=Integer.parseInt(br.readLine());
	while(i<=m)
	{
	if(n%i==0)
	{
	System.out.print("Number is not prime");
	flag=1;
	break;
	}
	}
	if(flag==0)
	System.out.print("Number is  prime");
	}}

	

		