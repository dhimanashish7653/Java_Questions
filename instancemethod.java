import java.util.*;
class ab
{
int a,b;
static int count;
int sum()
{return a+b;
}
public  void main(String X[])
{
ab ob=new ab();
Scanner sc=new Scanner(System.in);
ob.a=sc.nextInt();
ob.b=sc.nextInt();
int c=ob.sum();
System.out.print(c);

}
}