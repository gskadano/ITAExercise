package day2.JavaTraining.Exercises;

public class Exercise2ClassA {

	static String text = "Exercise2ClassA";
	
	public void method1(){
		System.out.println(text);
		method2("I am changed...");
	}
	
	public void method2(String newTxt){
		text = newTxt;
		System.out.println(text);
	}

}
