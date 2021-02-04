//9. WAP to Check whether an alphabet is vowel or consonant

class Vowel{
public static void main(String args[]){
		char arr[] = {'A','E','I','O','U'}; 
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character :");
		c = sc.next().charAt(0);
		for (int i =0;i<5;i++){
			if(arr[i] == c){
				System.out.println("Entered Character is Vowel.");
				break;
			}
			else 
				System.out.println("Entered Character is Consonant.");
				break;
				
		}
}