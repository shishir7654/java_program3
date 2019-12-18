import java.io.*;
public class whileExample5
{
	public static void main(String[]args)throws IOException
	{
	int n,reverse=0,rem;
	BufferedReader br=new  BufferedReader (new InputStreamReader(System.in));
	System.out.print("Enter the number");
	n=Integer.parseInt(br.readLine());
	while(n!=0)
	{
	rem=n%10;
	reverse=reverse*10+rem;
	n=n/10;

	}
	System.out.print("Reversed number"+reverse);
	}}




