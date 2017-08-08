package day2.JavaTraining.Exercises;

import java.util.ArrayList;

public class Exercise3Rodent {

	public static void main(String args[]) {
		ArrayList<Exercise3Rodent> rodents = new ArrayList<Exercise3Rodent>();
		rodents.add(new Exercise3Mouse());
		rodents.add(new Exercise3Hamster());
		rodents.add(new Exercise3Gerbil());
		
		for(Exercise3Rodent rodent : rodents){
			System.out.println(rodent.getClass().getName());
			rodent.eat();
			rodent.crawl();
			rodent.run();
		}
	}
	
	public void eat(){
		System.out.println("The rodents are eating...");
	}
	
	public void crawl(){
		System.out.println("The rodents are crawling...");
	}
	
	public void run(){
		System.out.println("The rodents are running...");
	}
}
