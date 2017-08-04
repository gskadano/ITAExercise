package day4.JavaTraining;

import JavaTraining.JAVA_TRAINING.Adder;
import JavaTraining.JAVA_TRAINING.Divider;
import JavaTraining.JAVA_TRAINING.Modulo;
import JavaTraining.JAVA_TRAINING.Multiply;
import JavaTraining.JAVA_TRAINING.Power;
import JavaTraining.JAVA_TRAINING.Subtracter;

public class App {

	public static void main(String args[]){
		Subtracter sub = new Subtracter();
		Adder add = new Adder();
		Divider div = new Divider();
		Modulo mod = new Modulo();
		Power pow = new Power();
		
		double multiply = Multiply.multiply(1.0, 1.0)
				, subtract = sub.subtract(add.add(1.0, 1.0), 1.0)
				, divide = div.divide(Multiply.multiply(subtract, 2.5), 0.5)
				, modulo = mod.modulo(100.0, 2.0)
				, power = pow.getMultiply(2.0, 2.0)
				, addition = add.add(3.0, 3.0);
		
		
	}
	
}
