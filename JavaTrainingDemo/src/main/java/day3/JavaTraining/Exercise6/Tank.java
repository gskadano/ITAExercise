package day3.JavaTraining.Exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class Tank {
	static Boolean empty = false;
	static int cntrLength = 0;
	static int cleanLength = 0;
	static Scanner sc = null;
	static ArrayList<Integer> counter = null;
	
	public static void main(String args[]) {
		
		//Getting user input
		getInput();
		
		int rmdInt = (int)Math.random()*(cntrLength+1);
		if(cntrLength > 0){
			fill();
			System.out.println("\nStarting to clean object...");
			clean(rmdInt);
			System.out.println("\nFinished cleaning object... \nClosing program!");
		}else{
			System.out.println("Exiting program...\nNo number input entered!");
		}
	}
	
	private static void clean(int rmdInt) {
		int counterSize = counter.size();
		if(counter.size()>rmdInt){
			for(int i=rmdInt;i>0;i--){
				counter.remove(counterSize);
				counterSize--;
			}
		}
		if(counter.size()==0){
			try {
				finalize(true);
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			try {
				finalize(false);
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void getInput(){
		String input = "";
		System.out.println("To exit, pleas input Y / y / Yes / yes to exit \nEnter a number greater than 20:");
		sc = new Scanner(System.in);
		if(sc.hasNextInt()){
			cntrLength = Integer.parseInt(sc.nextLine());
			if(cntrLength <= 20){
				System.out.println("Must input a number greater than 20!");
				getInput();
			}
		}else{
			input = sc.next();
			System.out.println("Must input a number!");
			if(input.toLowerCase().equals("y") || input.toLowerCase().equals("yes")){
			}else{
				getInput();
			}
		}
	}
	
	public static void fill(){
		counter = new ArrayList<Integer>();
		System.out.println("Counting from 0 to "+cntrLength);
		for(int i=0;i<cntrLength;i++){
			counter.add(i+1);
			System.out.println("Count "+counter.get(i));
		}
		System.out.println("Finished counting...");
	}
	
	public static void finalize(Boolean isEmpty) throws Throwable{
		if(!isEmpty){
			throw new Exception("Object count is not empty");
		}
		System.out.println("Object is Empty");
	}

}
