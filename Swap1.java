//8. WAP to Swap two numbers without using temporary variable

class Swap1{
public static void main(String args[]){
		int a,b;
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter 1st Number :");
		a = sc.nextInt();
		System.out.println("Enter 2nd Number :");
		b = sc.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swap a = " +a+" b = " +b);
	}
}