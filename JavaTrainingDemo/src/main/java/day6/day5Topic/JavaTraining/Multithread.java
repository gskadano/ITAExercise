package day6.day5Topic.JavaTraining;

class Runner extends Thread {
	
	@Override
	public void run() {
		
		// super.run();
//		for(int i=0;i<=10;i++){
//			System.out.println(this.getName());
//			System.out.println("Hello"+i);
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		System.out.println(this.getName());
	}
}

public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner runner1 = new Runner();
		runner1.start();
//		runner1.interrupt();
		runner1.setName("runner1");
		System.out.println(runner1.getName());
		
		Runner runner2 = new Runner();
		runner2.start();
		
		System.out.println("Hello World");

	}

}
