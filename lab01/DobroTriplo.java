/**
* Laboratório de Programação 2 - Lab 1
*
* @author João Vitor da Silva Souza - 122210993
*/

import java.util.Scanner;

public class DobroTriplo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int Y = num*2;
		int Z = num*3;
		System.out.println("dobro: " + Y + ", triplo: " + Z);
	}
} 
