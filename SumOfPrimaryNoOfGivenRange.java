
public class SumOfPrimaryNoOfGivenRange {

	public static void main(String[] args) {
		
		int lowerbound = 2; int upperbound = 13;
		int sum=0;
		
		for(int i = lowerbound; i<= upperbound; i++)
		{
			int flag = 1;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					flag=0; 
					break;
				}
			}
			if(flag==1)
			{
				sum = sum +i;
			}
		}
		
		System.out.println(sum);
		

	}

}
