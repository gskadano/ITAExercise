package day5.JavaTraining;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam {

	public static int value=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number 1 =================");
		number1();
		System.out.println("Number 2 =================");
		number2(5);
		number2(6);
		number2(7);
		number2(8);
		number2(9);
		System.out.println("Number 3 =================");
		number3();
		System.out.println("Number 4 =================");
		number4();
		System.out.println("Number 6 =================");
		number6();
		System.out.println("Number 7 =================");
		number7();
		System.out.println("Number 10A =================");
		number10A();
		System.out.println("Number 10B =================");
		number10b();
		System.out.println("Number 10C =================");
		number10c();
		System.out.println("Number 10D =================");
		number10d();
		System.out.println("Number 10E =================");
		number10e();
	}
	
	public static ArrayList<Integer> number10b() {
		// TODO Auto-generated method stub
		ArrayList<Integer> result = new ArrayList<Integer>();
		System.out.println("Main before p1: " + value);
		value = p1(value);
		System.out.println("Main before p2: " + value);
		value = p2(value);
		System.out.println("Main at the end: " + value);
		result.add(value);
		System.out.println("-----");
		int value = 30;
		System.out.println("Main before p1: " + value);
		value = p1(value);
		System.out.println("Main before p2: " + value);
		value = p2(value);
		System.out.println("Main at the end: " + value);
		result.add(value);
		return result;
	}

	private static int p2(int input) {
		// TODO Auto-generated method stub
		int value = 5;
		value = input / value;
		System.out.println("In p2: " + value);
		return value;
	}

	private static int p1(int input) {
		// TODO Auto-generated method stub
		value = input * value;
		System.out.println("In p1: " + value);
		return value;
	}

	public static String number10c() {
		// TODO Auto-generated method stub
		int value = 5;
		int value2 = 1;
		String result="";
		while (value2 < 4) {
			for (; value >= value2; value--) {
				System.out.println("*");
				result=result+"*";
			}
			value2++;
		}
		return result;
	}

	public static ArrayList<String> number10d() {
		// TODO Auto-generated method stub
		Boolean a = true, b = false, c = false;
		ArrayList<String> result = new ArrayList<String>();
		System.out.println(a + ", " + b + ", " + c);
		result.add(a + ", " + b + ", " + c);
		do {
			if (b == c)
				b = a;
			else if (a == c)
				b = c;
			else
				a = c;
			System.out.println(a + ", " + b + ", " + c);
			result.add(a + ", " + b + ", " + c);
		} while (a || b || c);
		
		return result;
	}

	public static String number10e() {
		// TODO Auto-generated method stub
		int one = 1;
		int two = 2;
		int three = 3;
		String result="";

		do {
			one++;
			System.out.print("cart");
			result = result+"cart";
		} while (one < 3);

		for (int i = 0; i < two; i++) {
			System.out.print("o");
			result = result+"o";
		}

		while (true) {
			three++;
			if (three == 5) {
				break;
			}
			System.out.print("n");
			result = result+"n";
		}
		return result;
	}

	public static ArrayList<String> number1(){
		ArrayList<String> result = new ArrayList<String>();
		int i = 1;
		for (int j = 0; j < 5; j = j + 2) {
			i = (i * i) + j;
		}
		switch (i) {
		case 3:
			System.out.println("zero");
			result.add("zero");
			break;
		case 13:
			System.out.println("one");
			result.add("one");
		case 175:
			System.out.println("two");
			result.add("two");
		default:
			System.out.println("default");
			result.add("default");
		}
		return result;
	}
	
	public static int number2(int n){
//		int n=5;
		int F_0 = 1, F_1 = 1;
		int F_n = 0;
//		System.out.println("Enter the number");
//		Scanner sc = new Scanner(System.in);
//		n = Integer.parseInt(sc.nextLine());
		for (int i = 1; i < n; i++) {
			F_n = F_0 + F_1;
			F_0 = F_1;
			F_1 = F_n;
		}
		System.out.println(F_n);
		return F_n;
	}
	
	public static int number3(){
		int inner = 2, outer = 2;
		int result = 0;
		for (int i = 0; i < outer; i++) {
			for (int j = 0; j < inner; j++) {
				result = (result * result) + 1;
			}
		}
		System.out.println(result);
		return result;
	}
	
	public static int number4(){
		int x = 3;
		int y = 10;
		int cntr=0;
		while (x < y) {
			System.out.println("Hello");
			x = x + 1;
			y = y - 1;
			cntr++;
		}
		return cntr;
	}
	
	public static void number6(){
//		System.out.println("Enter the number");
//		Scanner sc = new Scanner(System.in);
//		int input = Integer.parseInt(sc.nextLine());
		int input = 4;
		int[] i=null, j=null;
		
		
		for(int x=0; x<4;x++){
			for(int y=0;y<4;y++){
				System.out.print((x/4)+(y/4));
			}
			System.out.println("");
		}
	}
	
	public static int number7() {
		// Declare Local Variables boolean done = false; int count = 1; int
		// current = integer_value + 2;
		Boolean done = false;
		int count = 1, val = 60, current = val+2;
		
		while (!done) {
			current = current / count;
			if (current % 3 == 0)
				done = true;
			else if (current < 1)
				done = true;
			else
				count += 1;
			System.out.println(current);
		}
		System.out.println(count);
		return count;
	} // method compute_value
	
	public static double number10A(){
		double count;
		int limit;
		count = 9.0;
		limit = 43 / 4;
		for (; count <= limit; count = count + 0.5) {
			System.out.println("in for:" + count);
		}
		System.out.println("after for" + count);
		return count;
	}

}
