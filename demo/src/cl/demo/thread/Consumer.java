package cl.demo.thread;

import java.util.Queue;

public class Consumer implements Runnable {
	
	private Queue<Integer> queue;
	
	
	public Consumer(Queue<Integer> queue) {
		super();
		this.queue = queue;
	}


	@Override
	public void run() {
		
		while (true) {
		
			synchronized (queue) {
				while (queue.isEmpty()) {
					System.out.println("Queue is empty," + "Consumer thread is waiting" + " for producer thread to put something in queue"); 
	                try { 
	                    queue.wait(); 
	                } catch (Exception ex) { 
	                    ex.printStackTrace(); 
	                } 
				}
				System.out.println("Consuming value : " + queue.remove()); 
				queue.notifyAll(); 
			}
		}
	}
 
	
}
