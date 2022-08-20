package iNeuron_Assignment_3_String;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Printing the repeating characters and the number of repeating character
		System.out.print("Please enter the string you want: ");
		Scanner sc= new Scanner(System.in);
		int count=0;
		StringBuilder s1=new StringBuilder(sc.nextLine());
		String s2="";
		
		for(int i=0; i<s1.length();i++) {
			for(int j=i+1; j<s1.length();j++) {
				
				if(s1.charAt(i)==s1.charAt(j)) {
					

					char temp=s1.charAt(i);
					String test=String.valueOf(temp);
					if(s2.contains(test)) {
						break;
					}
					else {
						s2=s2+s1.charAt(j);
						count=count+1;
						System.out.format("Number %d repating character: ",count);
						System.out.println(s1.charAt(j));
						s1.deleteCharAt(j);
						
					}
					
				}
			}
		}
		System.out.println("The number of repeatating character in the String is: "+ count);
		sc.close();
		
	}
}
