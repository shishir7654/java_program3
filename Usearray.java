import java.io.*;
class Usearray
{
public static void main(String arge[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int x[]=new int[10];
int i,neg=0,pos=0;
System.out.print("Enter data");
for(i=0;i<10;i++)
{

x[i]=Integer.parseInt(br.readLine());
}
System.out.println("All data is");
for(i=0;i<10;i++)
{
if(x[i]<0)
neg++;
else
pos++;
}
 
System.out.println("negitive is"+neg);
System.out.println("positive is"+pos);
}
}
