//3. WAP to Find Factorial of a number
import java.util.*;
public class Factorial{
	static int Fact(int n){
	    int fac;
		if(n == 0) 
           return 1; 
        int i = n;
        fact = 1; 
        while (n / i != n) { 
            fac = fac * i; 
            i--; 
        } 
        return fac;
	}
	public static void main(String args[]){
	    int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		num = sc.nextInt();
		System.out.println("Factorial of "+ num +" is "+Fact(num) );
	}
}
