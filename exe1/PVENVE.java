//2. WAP to Check if a Number is Positive or Negative ?

public class PVENVE{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter a Number");
		n = sc.nextInt();
		if(n<0)
			System.out.println("Number is Negative.");
		else if(n>0)
			System.out.println("Number is Positive.");
		else 
			System.out.println("Number is Zero.");
			
	}
} 
