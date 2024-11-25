import java.util.*;

class newThread implements Runnable{
	Thread t;
	String name;
	newThread(String T_name){
		name = T_name;
		t = new Thread(this, name);
		System.out.println("Child Thread : "+ t);
		t.start();
	}

	public void run(){
		try{
			for(int i = 5; i > 0; i--){
				System.out.println(name +" (Child Thrad) : "+i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e){
			System.out.println("Chile Thread Interrupted");
		}
		System.out.println(name + " Child Thread Exiting ");
	}
}

class ThreadDemoImplement{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of the Child Thread : ");
		String T_name = sc.nextLine();
		new newThread(T_name);

		Thread.currentThread().setPriority(10);
		System.out.println("Main Thread " + Thread.currentThread());
		try{
			for(int i = 5; i > 0; i--){
				System.out.println("Main Thread : "+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Exiting Parent Thread");
	}
}