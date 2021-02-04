//1. WAP to Check Prime Number using loop?
public class primeNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,i,flag = 1;
		System.out.println("Entet the Number :");
		n = sc.nextInt();
		
		for (i=2;i<=n/2;i++){
			if(n%i == 0){
				flag = 0;
				break;
			}
		}
		if(n<=1)
			flag = 0;
		else if(n == 2)
			flag = 1;
		if (flag == 1)
			System.out.println(n +" "+"is Prime Number.");
		else
			System.out.println(n +" "+"is Not Prime Number.");	
	}
}
