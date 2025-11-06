package problemSolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArraysandCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {0,2,0,0,5,0}; 
ArrayList<Integer> num = new ArrayList<>();

MoveZerosToRight(arr);
//FindindexofSpecificElement( num, 6  );
//firstNoRepeatElemet(arr);
//FindDuplicateNumber(arr);
	}
	
	
	public static void FindDuplicateNumber(int[] arr) {
		// TODO Auto-generated method stub
		Set<Integer> myHashSet = new HashSet<>(); 
		List<Integer> dubledNumber= new ArrayList<>(); 
		int arrLeng = arr.length;
		for(int i=0; i< arrLeng; i++) {
			
			if(!myHashSet.contains(arr[i])) {
				myHashSet.add(arr[i]);
			}
			else {
				dubledNumber.add(arr[i]);
			}
		}
		System.out.println(dubledNumber );
	}
	public static void sortArrayUsingBubleSort(int[] arr) {
		int arrLeng = arr.length;
		
		for(int i=0; i< arrLeng-1; i++) {
			
			if (arr[i]< arr[i+1]) {
				
			}
		}
	}
	
	//first no repeat elemet
	public static void firstNoRepeatElemet(int[] arr) {
		Map<Integer, Integer> NumberCount = new LinkedHashMap<> ();
 		for(int x: arr) {
 			NumberCount.put(x, NumberCount.getOrDefault(x,0)+1);
 		}
 		
 		for(Map.Entry<Integer, Integer> x1: NumberCount.entrySet()) {
 			int key = x1.getKey();
 			int value = x1.getValue();
 			
 			if(value == 1) {
 				System.out.println(key);
 				return;
 			}
 			
 		}
 		System.out.println("No repeated number");
	}
	
	//find index of specific element 
	public static void FindindexofSpecificElement(ArrayList<Integer> number, int targetNumber  ) {
		int index = number.indexOf(targetNumber);
		if (index == -1)
			System.out.println("The number isnot here");
		else {
		System.out.println(index);
		}
	}
	
	
	////////////////Array minapulation ///////////////////////////////
	//move all zeros to the right in the array
	public static void MoveZerosToRight(int[] arr) {
		int PointerOne=0;
		int arrLeng = arr.length;
		for(int i=0; i< arrLeng; i++) {
			
			if(arr[i]!=0) {
			int temp = arr[PointerOne];
			arr[PointerOne]	= arr[i] ;
			arr[i] = temp;
			
			PointerOne++;
				
			}
		}
		
		for(int i=0; i< arrLeng; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	
	
}
