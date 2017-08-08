package day1.JavaTraining.Exercises;

public class Excercise1ClassC {

	static Excercise1ClassB classB;	
	
	public static void createClass(){
		try{
			System.out.println("This is Class C");
			classB = new Excercise1ClassB();
		}catch(Exception e){
			System.out.println("Null Pointer Exception: "+e);
		}
	}

}
