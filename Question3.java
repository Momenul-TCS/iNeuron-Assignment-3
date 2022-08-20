package iNeuron_Assignment_3_String;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Two strings are ANAGRAM or not.
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter the first String: ");
		String s1= sc.nextLine();
		s1=s1.toLowerCase();
		System.out.print("Please Enter the second String: ");
		String s2= sc.nextLine();
		s2=s2.toLowerCase();
		int flag=1;
		if(s1.length()==s2.length()) {
			for(int i=0; i<s1.length();i++) {
				char temp=s1.charAt(i);
				String test= String.valueOf(temp);
				if(s2.contains(test)) {
					continue;
				}else {
					flag=0;
				}
			}
		}else {
			System.out.println("Strings are not Anagrams");
			System.exit(0);
		}
		
		if(flag==1) {
			System.out.println("Strings are Anagrams");
		}else {
			System.out.println("Strings are not Anagrams");
		}
		
		sc.close();
		
		

	}

}
