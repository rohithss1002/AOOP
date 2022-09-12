import java.util.Scanner;

public class tm_2{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		System.out.println("Entered number is " + num);
		System.out.println("............................");
		
		
		try{
			if(num<0){
				throw new NegativeNumberNotAllowedException("Negative number is entered");
				
			}
		
		if(num>=0){
			for(int i=2;i<num/2;i++)
		{
				if((num%i)==0)
					throw new NumberNotPrimeException("Number is not a prime");
				break;
				     			
		}
		}
			System.out.println("Entered number is prime" + num);
		
		
		}catch( NegativeNumberNotAllowedException np){           //catch handles the exception
			
			System.out.println( np.toString());
	}catch( NumberNotPrimeException npn){           //catch handles the exception
	
			System.out.println( npn.toString());
	}
	
	
	} 	 
		
} 	

class NegativeNumberNotAllowedException extends Exception{
	public NegativeNumberNotAllowedException(String message){
	super(message);
	
  }
}
class NumberNotPrimeException extends Exception{
    public NumberNotPrimeException(String message){
	super(message);
  }
}
