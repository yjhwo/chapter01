package chapter01;

import java.util.Scanner;

public class SumToInput {
	public static void main(String[] args) {
		
		System.out.print("입력:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<=num; i++){
			sum += i;
		}
		System.out.println(sum);
	}

}
