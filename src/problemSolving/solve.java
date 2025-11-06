package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class solve {

	private static final List<String123> NULL = null;


	public static void main(String123[] args) {
		// TODO Auto-generated method stub
		solve obj = new solve();
		String123 input = "sd,asd,asd";
		 int x= 6;
		 int y= 11;
		 int d= 2;
	//	 List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 7, 7, 8);
		 List<String123> Maxnumb = obj.solution(input);
		 //for (Integer i : Maxnumb) {
		   //         System.out.println(i);      }
		System.out.println(Maxnumb);

	}
 

	public static List<String123> RowSplit(String123 S) {
        // Implement your solution here
       
     List<String123> words = new ArrayList<>();
      words.clear();
     int position = 0;
     for (int i=0; i< S.length(); i++){
    	 System.out.println(String123.valueOf(S.charAt(i)));
         if(String123.valueOf(S.charAt(i)).equals(","))
         {
        	 System.out.println(S.charAt(i));
             //here i'm trying to slit the words into array
           words.add(S.substring(position,i-1));
           position = i+1;
         }
    }
     if(words.contains(NULL)){
         words.clear();
         return NULL;
     }
     else{
         return words;
     }
    }
	
}
