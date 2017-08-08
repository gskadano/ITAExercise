package day6.day5Topic.JavaTraining;

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String any = ".*";
		
		String test1 = "Hello", test2 = "123", test3 = "@!#";
		System.out.println(test1.matches(any));
		System.out.println(test2.matches(any));
		System.out.println(test3.matches(any));
		
		System.out.println("-------------------");
		
		String almostAny = ".+";
		System.out.println(test1.matches(almostAny));
		System.out.println(test2.matches(almostAny));
		System.out.println(test3.matches(almostAny));
		
		System.out.println("-------------------");
		
		String numbersONly = "\\d*";
		System.out.println(test1.matches(numbersONly));
		System.out.println(test2.matches(numbersONly));
		System.out.println(test3.matches(numbersONly));
		
		System.out.println("-------------------");
		
		String colorOption = "(red|green|yellow)";
		System.out.println(test1.matches(colorOption));
		System.out.println(test2.matches(colorOption));
		System.out.println(test3.matches(colorOption));
		
		System.out.println("-------------------");
		
		String eitherGray = "Gr(a|e)y";
		System.out.println(test1.matches(eitherGray));
		System.out.println(test2.matches(eitherGray));
		System.out.println(test3.matches(eitherGray));
	}

}
