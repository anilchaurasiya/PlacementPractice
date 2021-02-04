//4. WAP to Display Fibonacci series ?
class Fibonacci{
	public static void main(String args[]){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		n = sc.nextInt();
		int a = 0, b = 1,c;
		System.out.print(a+" "+b+" ");
		for(int i = 2;i<=n;i++){
			c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}