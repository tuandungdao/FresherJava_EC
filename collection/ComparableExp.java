package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExp {
	 public static void main(String[] args) {
	        // create list students
	        List<Student> listStudents = new ArrayList<Student>();
	        
	        // add students to list
	        listStudents.add(new Student(1, "A", 19, "Hanoi"));
	        listStudents.add(new Student(2, "B", 20, "Hanoi"));
	        listStudents.add(new Student(3, "C", 21, "Hanoi"));
	        listStudents.add(new Student(4, "D", 22, "Hanoi"));
	        
	        // sort list student
	        Collections.sort(listStudents);
	        
	        // show list students
	        for (Student student : listStudents) {
	            System.out.println(student.toString());
	        }
	    }
}
