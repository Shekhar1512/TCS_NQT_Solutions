package tcsNQT;

public class Palindrome{
    public static void main(String[] args) {
        long  number = 1222222221; // Change this number to check for a different value
        long originalno = number;
        
        long reversenumber=0;
        long lastdigit=0;
        
        while(number>0)
        {
        	lastdigit = number%10;
        	reversenumber = reversenumber * 10 + lastdigit;
        	number = number/10;
        }
        
        if(originalno == reversenumber)
        {
        	System.out.println("Palindrome");
        }
        else
        {
        	System.out.println("Not Palindrome");
        	
        }
        
    }
}
