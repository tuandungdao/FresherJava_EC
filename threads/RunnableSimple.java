package threads;

public class RunnableSimple implements Runnable {
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableSimple runable = new RunnableSimple();
		Thread t1 = new Thread(runable);
		t1.start();
	}

}
