package lesson.eighteen;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PerformSystemCheck implements Runnable{
	
	private String checkWhat;
	ReentrantLock lock = new ReentrantLock();
	
	public PerformSystemCheck(String checkSom) {
		this.checkWhat = checkSom;
	}
	
	public void run() {
		lock.lock();
		
		System.out.println("Checkking "+ this.checkWhat);
		lock.unlock();
	  
	}

}
