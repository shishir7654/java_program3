import java.io.*;
class Transpose
{
public static void main(String arge[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int x[][]=new int[6][6];
int i,j;
System.out.print("Enter data");
for(i=0;i<4;i++)
{
for(j=0;j<3;j++)
{				
x[i][j]=Integer.parseInt(br.readLine());
}
}
System.out.println("Matrix is");
for(i=0;i<4;i++)
{
for(j=0;j<3;j++)
{				
System.out.print(" "+x[i][j]);
}
System.out.println("");
}
System.out.println("Transpose Matrix is");
for(i=0;i<3;i++)
{
for(j=0;j<4;j++)
{				
System.out.print(" "+x[j][i]);
}
System.out.println("");
}
}
}

