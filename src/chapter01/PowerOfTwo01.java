package chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int res =1;
		System.out.print("승수:");
		int pow = sc.nextInt();
		
		int i=0;
		while(i<pow){
			res *= 2;
			i++;
		}
		
		System.out.println("2의"+pow+"제곱근은"+res+"입니다.");
		sc.close();
	}

}
