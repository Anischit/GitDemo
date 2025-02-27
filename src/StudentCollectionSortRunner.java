import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student1.getId(), student2.getId());
	}
	
}

public class StudentCollectionSortRunner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = List.of(new Student(1,"anis"), new Student(100,"Adam"), new Student(2,"Eve"));
		System.out.println(students);
		
		List<Student> studentAL = new ArrayList<Student>(students);
		System.out.println("DSC" +studentAL);
		
		Collections.sort(studentAL);
		System.out.println(studentAL);
		
		//Collections.sort(studentAL, new AscendingStudentComparator());
		studentAL.sort(new AscendingStudentComparator());
		System.out.println("ASC"+studentAL);

	}

}
