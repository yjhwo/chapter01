package chapter01;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2016;
		
		if(year%4==0){
			System.out.println(year + "년은 윤년입니다.");
		}else
			System.out.println(year + "년은 윤년이 아닙니다.");
		
	}

}
