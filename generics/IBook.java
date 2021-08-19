package generics;

interface writer<T> {
	void update(T obj);

	void delete(T obj);

	void write(T obj);

}

class B<T> implements writer<T> {

	@Override
	public void update(T obj) {
		// do something
	}

	@Override
	public void delete(T obj) {
		// do something
	}

	@Override
	public void write(T obj) {
		// do something
		System.out.println("ABC");
	}

}

public class IBook {
	public static void main(String[] args) {
		B<String> t = new B<String>();
		t.write("Add data to book");
	}
}