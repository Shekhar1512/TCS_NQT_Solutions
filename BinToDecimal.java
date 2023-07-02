package tcsNQT;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class BinToDecimal {

	public static void main(String[] args) throws IOException{
		
		int l=0,ans=0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter a binary no:- ");
		int n = Integer.parseInt(reader.readLine());
		
		while(n>0)
		{
			l = n%10;
			n = n/10;
			ans = ans*2+l;
		}
		
		System.out.println(ans);

	}

}
