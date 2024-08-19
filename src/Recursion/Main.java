package Recursion;

public class Main {

	public static void main(String[] args) {

		print1();
		

	}
	
	static void print1() {
		
		System.out.println(1);
		print2();
		
	}
	
static void print2() {
		
		System.out.println(2);
		print3();
	}

static void print3() {

	System.out.println(3);
	
}

}
