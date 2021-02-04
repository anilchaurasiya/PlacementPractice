//13. WAP to Program to Check Prime Number
public class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,i,c=0;
		System.out.println("Entet the Number :");
		n = sc.nextInt();
		
		for (i = 1; i <= n/2; i++) {
        if (n % i == 0) {
           c++;
            }
		}
		if (c == 2)
			System.out.println(n +" "+"is Prime Number.");
		else
			System.out.println(n +" "+"is Not Prime Number.");	
	}
}