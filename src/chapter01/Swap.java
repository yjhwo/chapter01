package chapter01;

public class Swap {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 30;
		
		if(n1<n2){
			int n=n1;
			n1 = n2;
			n2 = n;
		}
			
		System.out.println("n1:"+n1);
		System.out.println("n2:"+n2);
		
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;
		
		if(a1>a2 && a1>a3){
			System.out.println("최댓값은 a1입니다.");
		}else if(a2>a1 && a2>a3){
			System.out.println("최댓값은 a2입니다.");
		}else{
			System.out.println("최댓값은 a3입니다.");
		}
		
	}

}
