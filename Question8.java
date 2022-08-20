package iNeuron_Assignment_3_String;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Counting the number of special character
		//Considering Space to be a special character
		
		System.out.print("Please enter the String: ");
		Scanner sc= new Scanner(System.in);
		String s1=sc.nextLine();
		int count=0;
		
		for (int i=0; i<s1.length(); i++) {
			if((((int)s1.charAt(i)>=48) && ((int)s1.charAt(i)<=57))|| (((int)s1.charAt(i)>=65) && ((int)s1.charAt(i)<=90)) || (((int)s1.charAt(i)>=97) && ((int)s1.charAt(i)<=122))) {
				continue;
			}
			else {
				count=count+1;
			}
		}
		
		System.out.print("The number of special character is: "+count);
		sc.close();
		

	}

}
