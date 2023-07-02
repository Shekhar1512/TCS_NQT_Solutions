package tcsNQT;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("enter n  ");
		int n =  Integer.parseInt(reader.readLine());
        int i=0,f=1;
		
		for( i = 0; i<n-1; i++ )
		{
			f = f * (n-i);
		}
		System.out.println(f);

	}

}
