
public class Base17ToDecimal2 {

	public static void main(String[] args) {
		
		
		String s = "1A";
		int decValue=0;
		int p=0;
		
		for(int i=s.length()-1; i>=0; i--)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				int digit = Character.getNumericValue(s.charAt(i));
				decValue = (int)Math.pow(17, p)*digit + decValue; p++;
			}
			else
			{
				    int digit=Character.toUpperCase(s.charAt(i))-'A'+10;
				    decValue = (int)Math.pow(17, p)*digit + decValue; p++;
			}
		}
		System.out.println(decValue);
		
		

	}

}
