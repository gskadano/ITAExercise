package day3.JavaTraining.Exercise4;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int curr=1,prev=0,show=1;
		while(show<=100){
			System.out.println(show);
			show=prev+curr;
			prev=curr;
			curr=show;
		}
	}

}
