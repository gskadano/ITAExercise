package day4.Test.JavaTraining;

import static org.junit.Assert.*;

import org.junit.Test;

import JavaTraining.JAVA_TRAINING.Adder;
import JavaTraining.JAVA_TRAINING.Divider;
import JavaTraining.JAVA_TRAINING.Modulo;
import JavaTraining.JAVA_TRAINING.Multiply;
import JavaTraining.JAVA_TRAINING.Power;
import JavaTraining.JAVA_TRAINING.Subtracter;

public class AppTest {
	
	public void setUp(){
		Subtracter sub = new Subtracter();
		Adder add = new Adder();
		Divider div = new Divider();
		Modulo mod = new Modulo();
		Power pow = new Power();
	}

	@Test
	public void testMultiply() {
		double result=0.0;
		
		result = Multiply.multiply(1, 2);
		assertEquals(2, result, 0);
		
		result = Multiply.multiply(1.2, 2.1);
		assertEquals(2.52, result, 0);
		
		result = Multiply.multiply(1.23, 2.10);
		assertEquals(2.583, result, 0);
		
		result = Multiply.multiply(1.23, 2.10);
		assertNotEquals(0, result, 0);
		
		assertNotNull(Multiply.multiply(-2.3, 2.10));
	}
	
	

}
