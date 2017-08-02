package day2.JavaTraining.Exercise1;

public class Exercise1ClassC {

	static Exercise1ClassB classB;	
	
	public static void createClass(){
		try{
			System.out.println("This is Class C");
			classB = new Exercise1ClassB();
		}catch(Exception e){
			System.out.println("Null Pointer Exception: "+e);
		}
	}

}
