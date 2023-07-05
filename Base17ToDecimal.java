package tcsNQT;



public class Base17ToDecimal {

	public static void main(String[] args) {
		
		String s = "23GF";
		int ans=0; 
		int p=0;
		
		for(int i=s.length()-1; i>=0; i--)
		{
			if(s.charAt(i)=='A')
			{
			      ans = (int)Math.pow(17,p)*10+ ans;	
			}
			else if(s.charAt(i)=='B')
			{
			      ans = (int)Math.pow(17,p)*11+ ans;	
			}
			else if(s.charAt(i)=='C')
			{
			      ans = (int)Math.pow(17,p)*12+ ans;	
			}
			else if(s.charAt(i)=='D')
			{
			      ans = (int)Math.pow(17,p)*13+ ans;	
			}
			else if(s.charAt(i)=='E')
			{
			      ans = (int)Math.pow(17,p)*14+ ans;	
			}
			else if(s.charAt(i)=='F')
			{
			      ans = (int)Math.pow(17,p)*15+ ans;	
			}
			else if(s.charAt(i)=='G')
			{
			      ans = (int)Math.pow(17,p)*16+ ans;	
			}
			
			else
			{
				int digit = Character.getNumericValue(s.charAt(i));
			      ans = (int)Math.pow(17,p)*digit+ ans;	
			}
		    p++;
			
		}
		System.out.println(ans);
		
		
	}
}
