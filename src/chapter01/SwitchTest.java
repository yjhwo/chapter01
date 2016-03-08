package chapter01;

public class SwitchTest {

	public static void main(String[] args) {

		int month = 10;
		int days = 0;

		switch (month) {
		case 2:
			days = 28;
			break;
		case 4:
			days = 30;
			break;
		case 6:
			days = 30;
			break;
		case 9:
			days = 30;
			break;
		case 11:
			days = 30;
			break;
		default:
			days = 31;

		}
	}

}
