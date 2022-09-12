import java.util.Scanner;

public class tm_3{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		
		String str = sc.nextLine();
		System.out.println("Entered string is " + str);
		System.out.println("............................");
		
		
		try{
			if(str.contains("SDMCET")){
				System.out.println("Search for sub String SDMCET sucessful");
			}
			
			else{
				throw new  SubStringNotFoundException("Sub string not found");
			}
			
		}catch( SubStringNotFoundException np){           //catch handles the exception
			
			System.out.println( np.toString());
	}
	
	} 	 
		
} 

class SubStringNotFoundException extends Exception{

public SubStringNotFoundException(String message){
	super(message);
}

}

