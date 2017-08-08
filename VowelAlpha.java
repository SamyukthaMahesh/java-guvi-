import java.util.*;

public class VowelAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char x;
System.out.println("Enter the character");
Scanner in = new Scanner(System.in);
x = in.next().charAt(0);
if (x=='a'|| x=='A'|| x=='e'|| x=='E'|| x=='o'|| x=='O'|| x=='i'|| x=='I'|| x=='u'|| x=='U')
{
	System.out.println("Vowel");
}
else
{
	System.out.println("Alphabet");
}
	}

}
