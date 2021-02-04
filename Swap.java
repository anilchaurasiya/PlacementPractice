//7. WAP to Swap two numbers using temporary variable
class Swap{
	public static void main(String args[]){
		int a,b,c=0;
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter 1st Number :");
		a = sc.nextInt();
		System.out.println("Enter 2nd Number :");
		b = sc.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println("After swap a = " +a+" b = " +b);
	}
}