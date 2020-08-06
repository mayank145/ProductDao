package lti.infotechday4;
import java.util.List;

public interface AppEngine {

		public void register(Student student);
		public void introduce (Course course);
		public void enroll(Student student,Course course );
		public list<Student> lisOfStudents();
		public list<Course> listOfCourse();
		public list<Enroll> listOfEnrollment();
}
