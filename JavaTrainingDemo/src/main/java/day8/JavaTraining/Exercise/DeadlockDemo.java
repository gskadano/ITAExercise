package day8.JavaTraining.Exercise;

public class DeadlockDemo {
	static Boolean lock1=true;
	static Boolean lock2=false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ThreadDemo1 T1 = new ThreadDemo1();
//		ThreadDemo2 T2 = new ThreadDemo2();
//		
//		T1.start();
//		T2.start();
		new ThreadDemo2().start();
		new ThreadDemo1().start();
	}
	
	private static class ThreadDemo1 extends Thread {
		public void run() {
			synchronized (lock1) {
				System.out.println("Thread 1: Holding lock 1...");
				try{
					Thread.sleep(10);
				}catch(InterruptedException e){
				}
				System.out.println("Thread 1: Waiting for lock 2...");
				
				synchronized (lock2) {
					System.out.println("Thread 1: Holding lock 1 & 2...");
				}
			}
		}
	}
	
	private static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized (lock1) {
				interrupt();
				System.out.println("Thread 2: Holding lock 2...");
				try{
					Thread.sleep(10);
				}catch(InterruptedException e){
				}
				System.out.println("Thread 2: Waiting for lock 1...");

				synchronized (lock2) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			}
		}
	}

}
