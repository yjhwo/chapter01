package chapter01;

import java.util.Scanner;

public class NHelloWorld02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i=0; i<cnt;i++){
			System.out.println("Hello World");
		}
	}

}