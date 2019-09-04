package leeson.seventeen;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Lesson Seventeen!");
        
		Thread getTime = new GetTime20();
		getTime.start();
		
		Runnable getMail = new GetMail(10);
		Runnable getMailAgain = new GetMail(20);
		
	   getMail.run();
	   getMailAgain.run();
		
	}

}
