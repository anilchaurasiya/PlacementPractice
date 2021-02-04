/*5. WAP to Display Fibonacci series up to a given
number (instead of terms)
Input: 20
Output:0 + 1 + 1 + 2 + 3 + 5 + 8 + 13.*/

class Fibonacci1{
    public static void main(String args[]){
		int n=0,a = 0,b = 1,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		n = sc.nextInt();
		System.out.print(a+" "+b+" ");
		do{
			c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
			
		}while(c<n);
	}
}

