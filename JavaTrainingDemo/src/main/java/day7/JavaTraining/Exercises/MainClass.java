package day7.JavaTraining.Exercises;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(6,0));
		System.out.println(add(1000000000,50000000));

	}
	
	public static int divide(int x, int y){
		return (int)(x / (float)y);
	}
	
	public static int add(int x, int y){
//		return x+y;
		return y==0 ? x : add(++x,--y);
	}
	

}