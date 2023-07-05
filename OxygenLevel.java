package tcsNQT;
import java.util.Scanner;

public class OxygenLevel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[] = new int[9];
		int tr1Sum=0;
		int tr2Sum=0;
		int tr3Sum=0;
		int flag1=1;
		int flag2=1;
		int flag3=1;
		
		System.out.println("Enter Oxygen values:-  ");
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int t1=0; t1<a.length; t1=t1+3)
		{
			if(a[t1]>=1 && a[t1]<=100)
			{
				tr1Sum = tr1Sum + a[t1]; 
			}
			else
			{
				flag1=0;
				break;
			}
		}
		
		for(int t2=1; t2<a.length; t2=t2+3)
		{
			if(a[t2]>=1 && a[t2]<=100)
			{
				tr2Sum = tr2Sum + a[t2]; 
			}
			else
			{
				flag2=0;
				break;
			}
		}
		
		for(int t3=2; t3<a.length; t3=t3+3)
		{
			if(a[t3]>=1 && a[t3]<=100)
			{
				tr3Sum = tr3Sum + a[t3]; 
			}
			else
			{
				flag3=0;
				break;
			}
		}
		
		//print
		
		if(flag1==0)
		{
			System.out.println("Invalid Input for trainne 1");
		}
		else
		{
			tr1Sum = tr1Sum/3;
		}
		
		if(flag2==0)
		{
			System.out.println("Invalid Input for trainne 2");
		}
		else
		{
			tr2Sum = tr2Sum/3;
		}

		if(flag3==0)
		{
			System.out.println("Invalid Input for trainne 3");
		}
		else
		{
			tr3Sum = tr3Sum/3;
		}
		
		//
		if(tr1Sum<70 && tr2Sum<70 && tr3Sum<70)
		{
			System.out.println("all trainee is unfit");
		}
		else
		{
			if(tr1Sum>=tr2Sum && tr1Sum>=tr3Sum)
			{
				if(tr1Sum==tr2Sum && tr2Sum==tr3Sum)
				{
					System.out.println("all are fit:- "+tr1Sum);
				}
				else if(tr1Sum==tr2Sum)
				{
					System.out.println("tr1 and tr2 fir: "+tr2Sum);
				}
				else if(tr1Sum==tr3Sum)
				{
					System.out.println("tr1 and tr3 fit: "+tr1Sum);
				}
				else {
					  System.out.println("tr1fit : -"+tr1Sum);
				}
				
			}
			else if(tr2Sum>=tr1Sum && tr2Sum>tr3Sum)
			{
				if(tr2Sum==tr3Sum)
				{
					System.out.println("tr2 and tr3 fir:- "+tr2Sum);
				}
				else {
					System.out.println("tr2 is fit."+tr2Sum);
				}
					
			}
			
			
			
			else if(tr3Sum>=tr1Sum && tr3Sum>=tr2Sum)
			{
				System.out.println("tr3 is fit:-  "+tr3Sum);
			}
			
			
		}
		
		System.out.println("\n "+tr1Sum+"\t"+tr2Sum+"\t"+tr3Sum);
		

	}

}
