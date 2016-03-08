package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");

		int divisor = 2;
		int num = sc.nextInt();
		boolean isPrime = true;
		
		while(divisor<num){
			int res = num%divisor;
			
			if(res==0)
				isPrime = false;
			
			divisor++;
		}
		
		if(isPrime)
			System.out.println(num+"은 소수입니다.");
		else
			System.out.println(num+"은 소수가 아닙니다.");

	}

}
