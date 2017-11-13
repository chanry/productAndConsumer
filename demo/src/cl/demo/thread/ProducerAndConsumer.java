package cl.demo.thread;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ProducerAndConsumer {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		Producer producer = new Producer(queue, 10);
		Consumer consumer = new Consumer(queue);
		
		Thread pth = new Thread(producer);
		Thread cth = new Thread(consumer);
		
//		pth.start();
//		cth.start();
		String path = ProducerAndConsumer.class.getResource("/").getFile();
		System.out.println(path);
	}
	
}
