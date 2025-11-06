package problemSolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class String123 {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
//		countofCharFrequencyandOder( word);
	//	countofCharvowel( word);
	
	String i = 	StringCompression( word);
	System.out.println(i);
	}

	public static void countofCharFrequencyandOder(String word) {
		int[] freceuncy = new int[256];
		
//count each char frequency		
		for(int i =0; i< word.length(); i++)
		{
			
			freceuncy[word.charAt(i)]++;
		}
		
		//adding all this chars to list to collect the chars only becuase it stor in array in different places
		List<Character> characters = new ArrayList<Character>();
		for(int i=0; i< 256; i++) {
			if(freceuncy[i] > 0 ) {
			 characters.add((char)i);}
		}
		
		//order that character
		int i=0;
		for( i =0; i< characters.size();i++ )
			System.out.println("first loop====");
			
		{
			for(int j=i+1; j< characters.size(); j++) {
				if(freceuncy[characters.get(i)] < freceuncy[characters.get(j)] )
				{
					char temp = characters.get(i);
					characters.set(i, characters.get(j));
					characters.set(j, temp);
				}
			}
		}
		
		for(char ch: characters) {
			System.out.println(ch+ " : "+ freceuncy[ch]);
		}
		
	}
	
	public static void countofCharvowel(String word) {
		int countVowel = 0;
		word = word.toLowerCase();
	for(int i=0; i <  word.length(); i++) {
		char x = word.charAt(i);
		if(x =='a' ||x =='i' || x =='e' ||x =='u' ||x =='o'  )
		{
			countVowel++;
		}
		
	}
	
	System.out.println(countVowel);
	
	}
	
	public static boolean isPangram(String word) {
		word = word.toLowerCase();
		Set<Character> characterr = new HashSet<Character>();
		for(int i=0; i< word.length(); i++) {
			char x =word.charAt(i);
			if(x >= 'a' && x<='z') {
				characterr.add(x);
			}
			
		}
		return characterr.size() == 26;
	}
	
	public static String StringCompression(String word) {
		StringBuilder StrB = new StringBuilder();
		int count = 1;
		for(int i=1; i< word.length(); i++) {
			if(word.charAt(i)== word.charAt(i-1)) {			
				count++;
			}
			else {
				StrB.append(word.charAt(i-1));
				StrB.append(count);
				count = 1;
			}
		}
		StrB.append(word.charAt((word.length()-1)));
		StrB.append(count);
		
		return StrB.length() < word.length()? StrB.toString():word;
	}
	
}
