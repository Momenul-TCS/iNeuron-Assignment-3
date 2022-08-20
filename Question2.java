package iNeuron_Assignment_3_String;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reversing a string while preserving the position
		// It can print even for more than two strings separated by spaces
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Print the String: ");
		String s1=sc.nextLine();
		String s2="";
		
		String[] s3=s1.split(" ");
		for(int i=0; i<s3.length; i++) {
			String subpart= s3[i];
			String r_subpart="";
			for(int j=subpart.length()-1; j>=0;j--) {
				r_subpart=r_subpart+subpart.charAt(j);			
			}
			
			s2=s2+" "+r_subpart;
		}
		
		System.out.println("The result is: "+ s2);
		sc.close();
		
	}

}
