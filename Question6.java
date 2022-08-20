package iNeuron_Assignment_3_String;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sorting the string alphabetically
		System.out.print("Please enter the string: ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		StringBuilder s2= new StringBuilder("");
		char[] str= s1.toCharArray();
		for(int repeat=0; repeat<str.length;repeat++) {
			sort(str);
		}
		
		for(int i=0; i<str.length;i++) {
			s2.append(str[i]);
		}
		System.out.println("The sorted string is: "+s2);
		sc.close();
		
	}
	
	static void sort(char[] chr) {
		for(int i=0; i<chr.length-1;i++) {
			if(chr[i]>chr[i+1]) {
				swap(chr, i, i+1);
			}
		}
	}
	
	static void swap(char[] chr, int index1, int index2) {
		char temp=chr[index1];
		chr[index1]=chr[index2];
		chr[index2]=temp;
		
	}

}
