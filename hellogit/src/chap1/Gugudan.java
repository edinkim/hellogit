package chap1;

import java.util.Scanner;

public class Gugudan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for (int i = 1; i <= 9; i++) { printDan(i); }
		 */
		System.out.print("gugudanfrom:");

		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		printDan(i);
	}

	public static void printDan(int i) {
		int k;
		for (int j = 1; j <= 9; j++) {
			k = i * j;
			if (k < 10) {
				System.out.println(i + " x " + j + " =  " + k);
			} else {
				System.out.println(i + " x " + j + " = " + k);
			}
		}
	}
}
