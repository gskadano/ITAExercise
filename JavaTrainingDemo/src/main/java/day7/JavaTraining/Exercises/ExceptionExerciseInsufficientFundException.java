package day7.JavaTraining.Exercises;

public class ExceptionExerciseInsufficientFundException {
	private int balance;

	public ExceptionExerciseInsufficientFundException(int need) throws Throwable{
		// TODO Auto-generated constructor stub
		this.balance = need;
		remainingFund();
	}
	
	public Throwable remainingFund(){
		return new Exception("Savings need more and additional of "+this.balance);
	}
}
