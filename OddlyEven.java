
public class OddlyEven {

	public static void main(String[] args) {
		
		
		
		long n = 5476;
		long sumOfEven = 0; 
		long sumOfOdd = 0;
		int i=1;
		long lastDigit =0;
		
		while(n>0) 
		{
			lastDigit = n%10;
			n=n/10;
			if(i++%2==0)
			{
				sumOfEven = sumOfEven+lastDigit; 
			}
			else
			{
				sumOfOdd = sumOfOdd+lastDigit;	
			}
			
		}
		System.out.println(Math.abs(sumOfEven-sumOfOdd));
		
		/*String s = "5476";
		long sumOfEven = 0; 
		long sumOfOdd = 0;
		
		
		for(int i=0; i<s.length(); i++)
		{
			if(i%2==0)
			{
				sumOfOdd = sumOfOdd + Character.getNumericValue(s.charAt(i));
			}
			else
			{
				sumOfEven = sumOfEven + Character.getNumericValue(s.charAt(i));
			}
		}
		
		System.out.println(Math.abs(sumOfEven-sumOfOdd));

	*/
	}
}
