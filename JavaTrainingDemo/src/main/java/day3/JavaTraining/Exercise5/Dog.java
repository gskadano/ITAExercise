package day3.JavaTraining.Exercise5;

public class Dog {
	
	public static void bark(){
		System.out.println("Woof! Woof!");
	}
	
	public static void bark(String breed){
		System.out.println(breed+": Woof! Woof!");
	}
	
	public static void bark(char a){
		System.out.println("grrrrrrr... Aaaaawwwwoooooooooooooo!");
	}
	
	public static void main(String args[]){
		bark();
		bark("poodle");
		bark('a');
	}

}
