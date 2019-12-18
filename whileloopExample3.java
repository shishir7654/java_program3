import java.in.*;
public class whileloopExample3
{
public static void main(String[]arg)throws IOException
{
int n,i=0;
BufferedReader br=new BufferedReader(new InputstreamReader(System.in));
System.out.print("Enter the n number");
n=Integer.parseInt(br.readLine());
while(i<=n)
{
if(n%2==0)
{
System.out.println("Even number");
i++;
}
if(n%2!=0)
{
System.out.println("odd number");
i++;
}
}}}
