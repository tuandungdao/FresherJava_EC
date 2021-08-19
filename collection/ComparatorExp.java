package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExp {
	public static void main(String[] args) {
		
		// create list students
		List<Student> listStudents = new ArrayList<Student>();
		// add students to list
		listStudents.add(new Student(1, "B", 20, "Hanoi"));
		listStudents.add(new Student(2, "A", 22, "Hanoi"));
		listStudents.add(new Student(3, "C", 19, "Hanoi"));
		listStudents.add(new Student(4, "D", 21, "Hanoi"));

		// sort list student by it's name ASC
		System.out.println("sort list student by it's name ASC: ");
		Collections.sort(listStudents, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		// show list students
		for (Student student : listStudents) {
			System.out.println(student.toString());
		}

		// sort list student by it's age ASC
		System.out.println("sort list student by it's age ASC: ");
		Collections.sort(listStudents, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() > o2.getAge() ? 1 : -1;
			}
		});
		// show list students
		for (Student student : listStudents) {
			System.out.println(student.toString());
		}
	}
}
