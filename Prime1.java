//14. WAP to Display Prime Numbers Between two Intervals
public class Prime1{
	public static void main(String args[]){
        int min,max,i,flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entet the 1st Number :");
		min = sc.nextInt();
		System.out.println("Entet the 2nd Number :");
		max = sc.nextInt();
		System.out.println("Prime numbers between "+ min +" and "  + max +" are : ");
	    while ( min < max) {
         flag = 0;
	  
        if (min <= 1) {
            ++min;
            continue;
        }

        for (i = 2; i <= min / 2; ++i) {

            if (min % i == 0) {
                flag = 1;
            break;
            }
        }

      if (flag == 0)
		System.out.print(min+" ");
		++min;
   }
}