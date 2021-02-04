//10. WAP to Find the largest number among the given numbers

class Largest{
public static void main(String args[]){
		int a,b,c;	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Numbers:");
		a = sc.nextInt();
		System.out.println("Enter 2nd Numbers:");
		b = sc.nextInt();
		System.out.println("Enter 3rd Numbers:");
		c = sc.nextInt();
		if(a>b && a>c){
			System.out.println(a+" is largest Number.");
		}
		else if(b>a && b>c){
			System.out.println(b+" is largest Number.");
		}
		else {
			System.out.println(c+" is Largest Numbers.");
	 	}
	 	
	}	
}