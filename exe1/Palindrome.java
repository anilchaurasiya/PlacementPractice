//12. WAP to Check Palindrome
class Palindrome{
		public static void main(String args[]){
		int n,a=0,pal=0,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");	
		n = sc.nextInt();
		pal = n; 
		while(n!=0){
		a = n%10;
		rev = rev*10 + a;
		n = n/10;	
		}
		if (rev == pal)
			System.out.println("Number is Palindrome.");
		else
			System.out.println("Number is not Palindrome.");
	}
} 