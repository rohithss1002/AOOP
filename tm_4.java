import java.util.Scanner;
import java.io.*;


public class tm_4 {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[]) throws IOException {
		
		try (BufferedReader buf = new BufferedReader(new FileReader("Alphabet.txt"))) {
			try (BufferedWriter wrt = new BufferedWriter(new FileWriter("consonants.txt"))) {
				String str = buf.readLine();
				
				for(int i=0; i<str.length(); i++) {
					try {
						if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') 
							throw new VowelNotAllowedException();
						else {
							wrt.write(str.charAt(i));
						}
					}catch(VowelNotAllowedException e) {
						e.message(str.charAt(i));
					}
				}
			}
		}
	}
	
	
}




