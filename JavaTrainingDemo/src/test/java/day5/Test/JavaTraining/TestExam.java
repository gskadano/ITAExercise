package day5.Test.JavaTraining;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import day5.JavaTraining.Exam;

public class TestExam {
	
	@Test
	public void testNumber1() {
		System.out.println("Number 1 ======================");
		ArrayList<String> results = Exam.number1();
		assertTrue(results.contains("one"));
		assertTrue(results.contains("two"));
		assertTrue(results.contains("default"));
		assertEquals(3, results.size());
		assertFalse(results.contains("zero"));
		
	}
	
	@Test
	public void testNumber2() {
		System.out.println("Number 2 ======================");
		assertEquals(8, Exam.number2(5));
		assertEquals(13, Exam.number2(6));
		assertEquals(21, Exam.number2(7));
		assertEquals(34, Exam.number2(8));
		assertEquals(55, Exam.number2(9));
	}
	
	@Test
	public void testNumber3() {
		System.out.println("Number 3 ======================");
		assertEquals(26, Exam.number3());
	}
	
	@Test
	public void testNumber4() {
		System.out.println("Number 4 ======================");
		assertEquals(4, Exam.number4());
	}
	
	@Test
	public void testNumber7() {
		System.out.println("Number 7 ======================");
		assertEquals(5, Exam.number7());
	}
	
	@Test
	public void testNumber10A() {
		System.out.println("Number 10A ======================");
		assertEquals(10.5, Exam.number10A(),0);
	}
	
	@Test
	public void testNumber10B() {
		System.out.println("Number 10B ======================");
		assertTrue(Exam.number10b().contains(120));
	}
	
	@Test
	public void testNumber10C() {
		System.out.println("Number 10C ======================");
		assertEquals("*****", Exam.number10c());
	}
	
	@Test
	public void testNumber10D() {
		System.out.println("Number 10D ======================");
		assertTrue(Exam.number10d().contains("false, false, false"));
	}

	@Test
	public void testNumber10E() {
		System.out.println("Number 10E ======================");
		assertEquals("cartcartoon", Exam.number10e());
	}
}
