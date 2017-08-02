package day3.JavaTraining.Exercise1_2;

import java.util.ArrayList;

public class Cycle {
	
	public void travel(String cycle) {
		System.out.println("I am now travelling on a "+cycle);
	}
	
	public void ride() {
		Cycle cycle = new Cycle();
		cycle = (Cycle) this;
		cycle.travel(cycle.getClass().getSimpleName());
	}
	
	public static void main(String args[]) {
		ArrayList<Cycle> cycles = new ArrayList<Cycle>();
		cycles.add(new Unicycle());
		cycles.add(new Bicycle());
		cycles.add(new Tricycle());
		
		System.out.print("\n");
		
		for(Cycle cycle : cycles){
//			cycle.balance(); //Error since object is upcasted
			System.out.println("Cannot call balance() method on "+cycle.getClass().getSimpleName());
		}
		
		System.out.print("\n");
		
		Unicycle unicycle = (Unicycle) cycles.get(0);
		unicycle.balance();
		Bicycle bicycle = (Bicycle) cycles.get(1);
		bicycle.balance();
		Tricycle tricycle = (Tricycle) cycles.get(2);
//		tricycle.balance(); //No balance() method
	}
}
