//15. WAP to Check Armstrong Number for 3 digit number

class Armstrong{
	public static void main(String args[]){
		int rem=0,n,sum=0,arm=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3 digit Number : ");
		n = sc.nextInt();
		arm = n;
		while(n != 0){
			rem = n%10;
			sum = sum+rem*rem*rem;
			n = n/10;
		}
		if(sum == arm)
			System.out.println("Number is Armstrong.");
		else 
			System.out.println("Number is not Armstrong.");	
	}
}