//5 student marks
//total
//average
import java.util.Scanner;
class Stringmark
{
	Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		Stringmark f1=new Stringmark();
		f1.mainu();
	}
	void mainu()
	{
		String a="97.6";
		String b="99.8";
		String c="95.9";
		String d="99.99";
		String e="100";
		
		double a1=Double.parseDouble(a);
		double b1=Double.parseDouble(b);
		double c1=Double.parseDouble(c);
		double d1=Double.parseDouble(d);
		double e1=Double.parseDouble(e);
		System.out.println("Student a mark: "+a1);
		System.out.println("Student b mark: "+b1);
		System.out.println("Student c mark: "+c1);
		System.out.println("Student d mark: "+d1);
		System.out.println("Student e mark: "+e1);
	}


}
	