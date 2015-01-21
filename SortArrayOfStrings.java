import java.util.Scanner;

public class SortArrayOfStrings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of strings: ");
		int n = input.nextInt();
		
		String[] str = new String[n];
		
		for (int i = 0; i < str.length; i++) {
			System.out.println("Enter string:");
			str[i] = input.next();	
		}
		System.out.println("Sorted:");
		for (int i = 0; i < str.length ; i++) {
			for (int j = i + 1; j < str.length; j++) {
	
					if(str[i].trim().compareTo(str[j]) > 0){
						String temp = str[i];
						str[i] = str[j];
						str[j] = temp;
					}			
			}	
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	
	}

}
