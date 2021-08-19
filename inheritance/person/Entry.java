package inheritance.person;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Khanh", 23, "Ha Noi", 9.0);
		s.display();
		System.out.println();
		Teacher t = new Teacher("Tung", 34, "Ha Noi", 1500);
		t.display();
	}

}
