//11. WAP to Reverse a Number
class Reverse{
		public static void main(String args[]){
		int n,a=0,b=0,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");	
		n = sc.nextInt();
		while(n!=0){
		a = n%10;
		rev = rev*10 + a;
		n = n/10;	
		}
		System.out.println("Reverse of the given Number is :" +rev);	
	}
} 