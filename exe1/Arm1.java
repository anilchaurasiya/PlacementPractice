//17. WAP to Armstrong Numbers Between Two Integers
public class Arm1{
public static void main(String args[]){
		int rem=0,a=0,arm=0,min,max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entet the 1st Number :");
		min = sc.nextInt();
		System.out.println("Entet the 2nd Number :");
		max = sc.nextInt();
		System.out.println("Armstrong numbers between "+ min +" and "  + max +" are : ");
		
		for (int i = min+1; i < max; i++) { 
        int x = i; 
        int count=0;
        arm = x;
        int b = arm;
        while (x != 0) { 
            x = x/10; 
            ++count; 
        }
		int pow_sum = 0; 
	    while (arm != 0) { 
                rem = arm % 10; 
                pow_sum += Math.pow(rem, count); 
                arm /= 10; 
            }
            if(pow_sum == b ) 
			System.out.print(pow_sum +" " );
		}
	}
}