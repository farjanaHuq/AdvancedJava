package internal;

public class helloWorld{
	
//	static String randomString = "Hey there!";
//	static final double PINUM = 3.141529;
//	static int numOne = 1; 
//	
	public static void main(String[] args) {
		
		//Primitive Data Type\
		byte bigByte = 127;
		short bigShort = 32767;
		int bigInt = 2100000000;
		long bigLong = 927000000000000000L;
		float bigFloat = 3.14F;
		double bigDouble = 3.141592653589793238;
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		boolean trueOrFalse = true;
		
		char randomChar = 66;
		char anotherChar = 'A';
		
		//Escaped Characters:
		// backspace = '\b', formfeed = '\f', lineFeed = '\n', carriageReturn ='\r', horizontalTab = '\t
		
	    char escapedChar = '\\';
	    
	    String randomString = "I am a random String";     //Technically an object
	    String anotherString = "Stuff";
	    
	    System.out.println(randomString + ' '+ anotherString);
		System.out.println(randomChar);
		System.out.println(anotherChar);
		
		//toString() function
		String byteString = Byte.toString(bigByte);
		System.out.println(byteString);
		
		//double to int		
		double aDoubleValue = 3.1415383985;
		int doubleToInt = (int)aDoubleValue;
		System.out.println(doubleToInt);
		
		//String to Int
		
		int stringToInt = Integer.parseInt(byteString);
		System.out.println(stringToInt);
		
		//Other parse functions: parseShort, parseDouble, parseFloat, parseBoolean
		
		
		
		
	    
//		System.out.println("Hello World!");
//		System.out.println(randomString);
//		System.out.println(PINUM);
//		
//		int numTwo = numOne +1;
//		
//		System.out.println(numOne);
//		System.out.println(numTwo);
	}
}