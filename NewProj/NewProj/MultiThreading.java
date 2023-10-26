package NewProj;

class pen extends Thread{
	public void run() {
		System.out.println("use this pen");	
		for(int i=0; i<=5; i++) {
			System.out.println("use mine");
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
}
}

class marker extends Thread{
	public void run() {
		System.out.println("use my marker ");	
		for(int i=0; i<=5; i++) {
			System.out.println("use mine please");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
}
}


public class MultiThreading {
	public static void main(String args[]) {
		
	pen p1 = new pen();
	 marker my = new marker();
	 p1.start();
	 my.start();
	
		
	}


}


