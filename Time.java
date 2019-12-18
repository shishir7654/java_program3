class Time
{
private
int hr,min,sec;
public
 Time()
{
hr=0;
min=0;
sec=0;
}
Time(int h,int m,int s)
{
hr=h;
min=m;
sec=s;
}
 void disp()
{
System.out.println("Hour is"+hr);
System.out.println("Min is "+min);
System.out.print("Sec is"+sec);
}

public static void main(String arge[])
{
Time t1=new Time();
Time t2=new Time(2,3,4);
t1.disp();
t2.disp();
}
}