package day7.JavaTraining.Exercises;

class ThreadRunnable implements /*Generator<String>,*/ Runnable {
	private String threadName;
	private int loop=0;
	private Thread t;
	
	public ThreadRunnable(String name){
		this.threadName = name;
		System.out.println("Creating thread "+this.threadName);
	}
	
	public void run() {
//		System.out.println(this.threadName+" , "+this.loop);
		try {
			for(int i=0;i<3;i++){
				System.out.println(this.threadName+" , "+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.threadName+" has ENDED");
	}
	
	public void start(){
		if(t==null){
			t = new Thread();
			t.start();
			System.out.println("Starting thread "+this.threadName);
		}
	}
}

public class MultithreadExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Thread thread = null;
		for(int i=1;i<=3;i++){
			thread = new Thread(new ThreadRunnable("Thread"+i));
			System.out.println("Thread name: "+thread.getName()+" | Thread state: "+thread.getState());
			thread.start();
			System.out.println("Thread name: "+thread.getName()+" | Thread state: "+thread.getState());
		}*/
		
		ThreadRunnable thread;
		for(int i=1;i<=3;i++){
			thread = new ThreadRunnable("Thread"+i);
			thread.start();
		}
	}

}
