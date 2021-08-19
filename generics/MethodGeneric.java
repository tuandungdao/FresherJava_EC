package generics;

import java.util.ArrayList;

class Store {
	public static <E> E getFirstElement(ArrayList<E> arr) {
		if (arr.isEmpty())
			return null;
		E first = arr.get(0);
		return first;
	}
}

public class MethodGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("Codelearn.io");
		list.add("Google.com");
		list.add("Azure");
		list.add("GCF");
		System.out.println(Store.getFirstElement(list));
	}

}
