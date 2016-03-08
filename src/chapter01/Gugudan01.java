package chapter01;

public class Gugudan01 {

	public static void main(String[] args) {
		
		int i = 2;
		int j = 1;
		
		while(i<=9){
			while(j<=9){
				System.out.println(i+"*"+j+"="+(i*j));
				j++;
			}
			i++;
			j=1;
		}
		
		
	}

}
