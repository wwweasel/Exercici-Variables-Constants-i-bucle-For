
public class Fase4 {

	public static void main(String[] args) {
		//
		String name = "Nils Frahm";
		int birth_year = 1983;
		
		System.out.println("My name is " + name );
		System.out.println("I was born in " + birth_year +"/6/7" );
		
		if( birth_year % 4 == 0 && (birth_year % 100 != 0 || birth_year % 400 == 0) ) {
			System.out.println("My birth year is a leap year");
		}else {
			System.out.println("My birth year is not a leap year");
		}
	}
}
