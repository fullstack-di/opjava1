import java.util.*;
class Basicsalary
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float bs,da,it,gs,nt;
		System.out.println("enter the basic salary");
		bs=sc.nextFloat();
		if(bs<5000)
		{
			da=(8*bs)/100;
			it=(6*bs)/100;
		}
		else if(bs>=5000 && bs<10000)
		{
			da=(15*bs)/100;
			it=(9*bs)/100;
		}
		else {
			da=(18*bs)/100;
			it=(12*bs)/100;
		}
			gs=bs+da;
			nt=gs-it;
		System.out.println("gross salary"+gs);
		System.out.println("net salary"+nt);
	}
}