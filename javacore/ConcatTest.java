package javacore;

public class ConcatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer(" Dzung");
		for (int i = 0; i < 100000; i++) {
			sb.append("Hi guys,");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time concat String of StringBuffer: " + (endTime - startTime) + " ms");
		
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder(" Dzung");
		for (int i = 0; i < 100000; i++) {
			sb2.append("Hi guys,");
		}
		endTime = System.currentTimeMillis();
		System.out.println("Time concat String of StringBuilder: " + (endTime - startTime) + " ms");
	}

}
