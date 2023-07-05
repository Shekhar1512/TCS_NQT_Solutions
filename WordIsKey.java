package tcsNQT;
import java.util.HashSet;
import java.util.Scanner;

public class WordIsKey {

	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<>();
		set.add("break");
		set.add("case");
		set.add("continue");
		set.add("defer");
		set.add("else");
		set.add("for");
		set.add("func");
		set.add("goto");
		set.add("if");
		set.add("map");
		set.add("range");
		set.add("return");
		set.add("var");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your word:-  ");
		String word = sc.next();
		if(set.contains(word))
		{
			System.out.println(word+" is a keyword");
		}
		else
		{
			System.out.println(word+" is not a keyword");
		}
		
		

	}

}
