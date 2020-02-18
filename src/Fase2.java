import java.util.Scanner;

public class Fase2 {

	public static void main(String[] args) {
		//
		final int base_year = 1948;
		
		Scanner input = new Scanner(System.in);
		int input_year = input.nextInt();
		
		if( input_year % 4 == 0 && (input_year % 100 != 0 || input_year % 400 == 0) ) {
			System.out.println("Its a leap year");
		}else {
			System.out.println("Its not a leap year");
		}
		
		
		//
		final int myBirthday = 1981;
		
		int count = 0;
		for (int i = base_year; i <= myBirthday; i++) {
			if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
				count ++;
			}
		}
		System.out.println("There were "+count+" leap years between "+ myBirthday+ " and " + base_year+".");

	}

}
