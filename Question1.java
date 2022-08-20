package iNeuron_Assignment_3_String;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reversing a String
		Scanner sc= new Scanner(System.in);
		System.out.print("Please give an input to reverse the string: ");
		String s1=sc.nextLine();
		String s2="";
		
		for(int i=s1.length()-1; i>=0;i--) {
			s2+=s1.charAt(i);
		}
		System.out.println("The reversed String is: "+s2);
		sc.close();
		
		
	}

}
