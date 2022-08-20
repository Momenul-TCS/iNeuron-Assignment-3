package iNeuron_Assignment_3_String;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Checking if a string is PANGRAM or not.
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String s1=sc.nextLine();
		
		s1=s1.toLowerCase().trim();
		s1=s1.replaceAll("\\s", "");
		
		String ref="abcdefghijklmnopqrstuvwxyz";
		
		int flag=1;
		
		for(int i=0; i<ref.length();i++) {
			char temp=ref.charAt(i);
			String test=String.valueOf(temp);
			if(s1.contains(test)) {
				continue;
			}else {
				flag=0;
			}
		}
		
		if(flag==0) {
			System.out.println("The string is Not Pangram");
		}else {
			System.out.println("The string is Pangram");
		}
		
		sc.close();

	}

}
