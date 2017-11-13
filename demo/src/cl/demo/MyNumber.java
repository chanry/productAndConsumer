package cl.demo;

public class MyNumber implements Runnable {
	
	public int i = 0;
	
	@Override
	public void run() {
		synchronized (this) {
			while (i < 5) {
				System.out.println(i);
				i++;
			}
		}
		
	}

}
