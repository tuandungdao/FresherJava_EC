package javacore;

public class StringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String stringObject = new String("Hello how are you");
	    //new String(“Hello how are you”) stores on heap memory 
	    System.out.println(stringObject);
	    String stringLiteral = "Helloworld";
	    //object “Helloworld” (also call string literal) stores on another heap memory’s area, called String Constant pool.
	    System.out.println(stringLiteral);
	    
	    String str1 = "Hello";
	    String str2 = "Hello";
	    System.out.println(str1 == str2);
	}

}
