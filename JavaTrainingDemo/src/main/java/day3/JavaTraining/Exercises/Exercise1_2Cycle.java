package day3.JavaTraining.Exercises;

import java.util.ArrayList;

public class Exercise1_2Cycle {
	
	public void travel(String cycle) {
		System.out.println("I am now travelling on a "+cycle);
	}
	
	public void ride() {
		Exercise1_2Cycle cycle = new Exercise1_2Cycle();
		cycle = (Exercise1_2Cycle) this;
		cycle.travel(cycle.getClass().getSimpleName());
	}
	
	public static void main(String args[]) {
		ArrayList<Exercise1_2Cycle> cycles = new ArrayList<Exercise1_2Cycle>();
		cycles.add(new Exercise1_2Unicycle());
		cycles.add(new Exercise1_2Bicycle());
		cycles.add(new Exercise1_2Tricycle());
		
		System.out.print("\n");
		
		for(Exercise1_2Cycle cycle : cycles){
//			cycle.balance(); //Error since object is upcasted
			System.out.println("Cannot call balance() method on "+cycle.getClass().getSimpleName());
		}
		
		System.out.print("\n");
		
		Exercise1_2Unicycle unicycle = (Exercise1_2Unicycle) cycles.get(0);
		unicycle.balance();
		Exercise1_2Bicycle bicycle = (Exercise1_2Bicycle) cycles.get(1);
		bicycle.balance();
		Exercise1_2Tricycle tricycle = (Exercise1_2Tricycle) cycles.get(2);
//		tricycle.balance(); //No balance() method
	}
}
