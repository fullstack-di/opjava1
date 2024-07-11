import java.util.*;
class LIc
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("displays all the details as : ");
		 int s,d,p,dis;
                 float c,com;
		String name;
		System.out.println("name of te policy holder : ");
		name=sc.next();
		System.out.println("sum assured : ");
		s=sc.nextInt();
		System.out.println("premiun : ");
		p=sc.nextInt();
		if(s<=100000)
		{
			d=(s*5)/100;
			c=(s*2f)/100;
		}
		else if(s>=100001 && s<=200000)
		{
			d=(s*8)/100;
			c=(s*3f)/100;
		}
		else if(s>=200001 && s<=500000)
		{
			d=(s*10)/100;
			c=(s*5f)/100;
		}
		else 
		{
			d=(s*15)/100;
			c=(s*7.5f)/100;
		}
		dis=s-d;
		com=s-c;
		System.out.println("discount on the first premium : "+dis);
		System.out.println("commission of the agent : "+com);
	}
}

		
		
