package iNeuron_Assignment_3_String;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Counting the number of vowels and consonant in string.
		//Considering there is no special character present in the string.
		
		System.out.print("Please input the String: ");
		Scanner sc= new Scanner(System.in);
		
		String s1=sc.nextLine();
		s1=s1.toUpperCase();
		int v_count=0;
		int c_count=0;
		
		for(int i=0; i<s1.length();i++) {
			if((s1.charAt(i)=='A'|| s1.charAt(i)=='E' || s1.charAt(i)=='I' || s1.charAt(i)=='O' || s1.charAt(i)=='U') && ((int)s1.charAt(i)!=0)){
				v_count=v_count+1;
			}
			else if((int)s1.charAt(i)!=0){
				c_count=c_count+1;
			}
				
		}
		
		System.out.println("The number of vowel is: "+v_count);
		System.out.println("The number of constant is: "+c_count);
		sc.close();

	}

}
