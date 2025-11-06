package problemSolving;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Pb {

	public static void main(String123[] args) {
		// TODO Auto-generated method stub
		int number = 32111115;
		int[] arr= {1,2,4,6};
		
	//	int x=	FactorialOfAnumber( number);
	//int x=	ReverseInteger(number);
	//	fabonecciNum( number);
    // countOfOddandEven (number);
       //System.out.println(x); 
	//	countofDigit();
	//	largestNumOfthreeNumb(number) ;
	//	if(checkTheNumIsPrime()) {
		findmissingNumber( arr) ;
	}

	
	public static void countOfOddandEven (int number) {
	int num = 0;
	int counteven = 0 ;
	int countOdd = 0;
		while(number  != 0) {
			
			int num1 = number%10;
		        // Multiply by 10 and take integer part
		        if (num1%2 == 0) {
		        	counteven++;
		        }
		        else {
		        	countOdd++;
		        }
		        number = number/10;
		}
		  System.out.println(counteven);
		  System.out.println(countOdd);
	
	}
	
	//0,1,1,2,3,5,8,13
	public static void fabonecciNum(int number) {
		int sum = 0;
		int x=1;
		for(int i=0; i<10; i++)
		{   
			System.out.println(sum);
		    int y =sum;
			 sum = sum +x;			    
			x = y;
			
		}
		
	}
	
	public static int ReverseInteger(int number) {
		int thenum = 0;
		
		while(number !=0) {
			int Reversenum = number%10;
			thenum = thenum*10 + Reversenum;
			number = number/10;
			
		}
		return thenum;
	}
	
//	5! = 5*4*3*2*1
	public static int FactorialOfAnumber(int number) {
		int factoial = 1;
		if (number==0 ||number==1 ) {
			return 1;
		}
		for(int i =number ; i>0 ; i-- ) {
			factoial = factoial*i;
		}
		
		return factoial ;
	}
	
	//madam if i read it from forward or backward it will be the same
	public static boolean isPolindrome(String123 name) {
		name = name.replaceAll("\\s+", "").toLowerCase();
		int left= 0;
		int right = name.length()-1;
		
		while (left< right) {
			if(name.charAt(left) != name.charAt(right) ) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void countofDigit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number:");
		int number = scanner.nextInt();
		int sum=0;
		while(number != 0 ) {
			sum= sum+ (number%10);
			number = number/10;
		}
		System.out.println("============== " +sum + " ======================" );
		scanner.close();
	}
	public static void largestNumOfthreeNumb(int num) {
		int x=0;
		int max=0;
		while(num !=0)
		{
		 x = num%10;
		 num= num/10;
		 if(max< x)
		 {
			 max = x;
		 }
		}
		System.out.println("============== " +max + " ======================" );
	}
	public static boolean checkTheNumIsPrime() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if (num <=0)
		{
		//	System.out.println("============== is not prime ======================" );
			return false;
		}
		for(int i=2; i<= Math.sqrt(num); i++)
		{
			if(num%i ==0) {
				return false;
			}
			
	} 
		return true;
}
	
//find the missing number 
	public static void findmissingNumber(int[] arr) {
		//arr = {1,2,5,7,9};
		int arrlen= arr.length;		
	    Arrays.sort(arr);
	    int firstNum = arr[0];
	    int lastname = arr[arrlen-1];
	    List<Integer> holdMissingNumber = new ArrayList<>();
	    for(int i=0; i<=lastname ; i++)
	    {
	    	if(!contains(arr, i)) {
	    		holdMissingNumber.add(i);
	    	}
	    	// <>
	    }
	    if (holdMissingNumber.size() >0) {
	    	for(int i: holdMissingNumber) {
	    		System.out.println(holdMissingNumber.get(i));		
	    	}
	    }
	    else {
	    	System.out.println("============== no missing number ======================" );
	    }
	    
	}
	public static boolean contains(int[] x,int y ) {
		for(int i:x) {
			if(y==x[i])
				return true;
				
		}
		return false;
	} 




}
