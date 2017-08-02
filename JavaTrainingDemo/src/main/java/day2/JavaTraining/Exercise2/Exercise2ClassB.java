package day2.JavaTraining.Exercise2;

public class Exercise2ClassB extends Exercise2ClassA{

	public void method2(){
		int x=1,y=1;
		System.out.println("Sum of x and y is "+(x+y));
	}
	
	public static void main(String args[]) {
		Exercise2ClassB classB = new Exercise2ClassB();
		Exercise2ClassA classA = (Exercise2ClassA) classB;
		classA.method1();
		
//		Exercise2ClassA classA = new Exercise2ClassB();
//		classA.method1();
	}

}
