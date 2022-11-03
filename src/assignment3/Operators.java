package assignment3;

public class Operators {
	public static void main(String[] args) {
		int a=4;
		int b=10;
		
		if(a!=b) {
			System.out.println("a is not equal to b");
			
		}
		else {
			System.out.println("a is equal to b");
		}
		if (a>0 && b>0) {
			System.out.println("a and b are greater than positive");
			
		}
		else {
			System.out.println("both are negative");
		}
		if (a<0 ||a>0) {
			System.out.println("non zero number");
		}	
		else {
		System.out.println("zero");
		}
	}

}
