package generics;

public class Book extends Dictionary<String, String> {

	public Book(String key, String value) {
		super(key, value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book l = new Book("Study", "hoc");
		String english = l.getKey();
		String vietnamese = l.getValue();
		System.out.println(english + ": " + vietnamese);
	}

}
