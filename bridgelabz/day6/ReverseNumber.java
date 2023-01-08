package com.bridgelabz.day6;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int rev=0;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Number");
		int a= scan.nextInt();
		while(a!=0) {
			int reminder =a%10;
			rev=rev*10+ reminder;
			a=a/10;
		}
		System.out.println(rev);
	}}