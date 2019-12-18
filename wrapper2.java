
import java.io.*;
class wrapper2
{
   public static void main(String[]args)throws IOException
{
 char ch;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
while(true)
{
System.out.print("Enter the char ");
ch=(char)br.read();

System.out.print("you entered");
if(Character.isDigit(ch))
System.out.println("a digit ");

else if(Character.isUpperCase(ch))
System.out.println("an upperCase letter ");

else if(Character.isLowerCase(ch))
System.out.println("an LowerCase letter ");

else if(Character.isSpaceChar(ch))
System.out.println("an SpaceCase character ");

else if(Character.isWhitespace(ch)){
System.out.println("an WhiteSpace character ");
return;
}

else System.out.println("Sorry, i dont know that");
br.skip(2);
}
}}



