package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		while(count>0){
			System.out.println("Hello World");
			count--;
		}
		sc.close();
	}

}
