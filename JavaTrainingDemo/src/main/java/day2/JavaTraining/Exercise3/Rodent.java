package day2.JavaTraining.Exercise3;

import java.util.ArrayList;

public class Rodent {

	public static void main(String args[]) {
		ArrayList<Rodent> rodents = new ArrayList<Rodent>();
		rodents.add(new Mouse());
		rodents.add(new Hamster());
		rodents.add(new Gerbil());
		
		for(Rodent rodent : rodents){
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
