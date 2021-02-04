//16. WAP to Check Armstrong Number for n digit number
class Armstrong{
	public static void main(String args[]){
		int rem=0,a=0, n,arm=0,count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		n = sc.nextInt();
		a = n;
		arm = a; 
		while(n != 0)
        {
        count++;
        n = n/10;
        }
   
		int pow_sum = 0;  
	    while (a != 0) { 
                rem = a % 10; 
                pow_sum += Math.pow(rem, count); 
                a /= 10; 
            }
		if(pow_sum == arm)
			System.out.println("Number is Armstrong.");
		else 
			System.out.println("Number is not Armstrong.");	
	}
}