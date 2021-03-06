package day3.JavaTraining.Exercises;

public class Exercise6TankPlain {
	static Boolean empty = false;
	
	public static void main(String args[]) {
//		fill(true);
		fill(false);
		try {
			finalize(empty);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	public static void fill(Boolean isEmpty){
		empty = isEmpty;
	}
	
	public static void finalize(Boolean isFull) throws Throwable{
		if(isFull){
			throw new Exception("Object count is not empty");
		}
		System.out.println("Object is Empty");
	}

}
