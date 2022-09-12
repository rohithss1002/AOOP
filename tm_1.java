import java.io.*;
class tm_1{
	
	public static void main(String args[]){
		try{
			int a=30,b=0;
			int c=a/b;
			System.out.println("Result=" + c);
		}catch(ArithmeticException e){
			System.out.println("Can't divide a number by 0");
		}
		
		try{
			int z[] = new int[4];
			z[7]=9;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index is Out Of bounds");
		}
		
		try{
			FileInputStream f = null;
			f = new FileInputStream("abc.txt");
			int i;
			while(( i =f.read())!=-1){
				System.out.println((char)i);
			}
			f.close();
		}catch(IOException e){
				System.out.println("IO Exception occured");
		}
		
	}
			
	}