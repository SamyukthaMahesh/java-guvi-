import java.util.*;
public class PosNegZer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x;
System.out.println("Enter the number");
Scanner in = new Scanner(System.in);
x = in.nextInt();
if (x==0)
{
	System.out.println("0");
}
else if (x<0)
{
	System.out.println("0");
}
else if(x>0)
{
	System.out.println(x%100);
}
	}

}
