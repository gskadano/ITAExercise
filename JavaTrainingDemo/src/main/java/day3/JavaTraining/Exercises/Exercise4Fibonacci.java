package day3.JavaTraining.Exercises;

public class Exercise4Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int curr=1,prev=0,show=1;
//		while(show<=100){
//			System.out.println(show);
//			show=prev+curr;
//			prev=curr;
//			curr=show;
//		}
		printFibo(curr, prev, show);
	}
	
	public static void printFibo(int curr, int prev, int toShow){
		if(toShow<=100){
			System.out.println(toShow);
//			toShow=add(prev,curr);
//			prev=curr;
//			curr=toShow;
			printFibo(toCurr(add(prev,curr)),toPrev(curr),add(prev,curr));
		}
	}
	
	public static int add(int a, int b){
		return a+b;
	}
	
	public static int toPrev(int curr){
		return curr;
	}
	
	public static int toCurr(int show){
		return show;
	}

}
