package leeson.seventeen;

import java.util.*;

public class GetMail implements Runnable {
    
	private int startTime;
	
	public GetMail(int startTime) {
		this.startTime = startTime;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(startTime*1000);
		}
		catch(InterruptedException e) {}
		System.out.println("Checking the email.");
	}


}
