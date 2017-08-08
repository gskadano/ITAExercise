package day6.JavaTraining.Exercises;

import java.util.ArrayList;

public class MainClassExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> string = null;
		
		try{
			string.get(0);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
