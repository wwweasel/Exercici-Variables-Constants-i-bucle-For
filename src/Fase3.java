import java.util.Scanner;

public class Fase3 {

	public static void main(String[] args) {
		// 
		int myBirthday = 1981;
		int base_year = 1948;
		for (int i = base_year; i <= myBirthday; i=i+4) {
			System.out.println("Leap Year:" + base_year);
			base_year  += 4;			
		}
		
		int birthday;
		Scanner birthday_input = new Scanner(System.in);
		birthday = birthday_input.nextInt();
		boolean isLeapYear;
		
		String phrase_true = "Your birthday is a leap year!"; 
		String phrase_false = "Your birthday is not a leap year!"; 
		
		if( birthday % 4 == 0 && (birthday % 100 != 0 || birthday % 400 == 0) ) {
			isLeapYear = true;
			System.out.println(phrase_true);
		}else {
			isLeapYear = false;
			System.out.println(phrase_false);
		}

	}

}
