package classes;

public class Lecturer extends Researcher {

	private Course[] courses;

	public Lecturer(int ssn, String name, String email, String fieldOfStudy) {
		super(ssn, name, email, fieldOfStudy);
	}

	/**
	 * 
	 * @param course
	 */
	public void addCourse(Course course) {
		// TODO - implement classes.Lecturer.addCourse
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param course
	 */
	public void removeCourse(Course course) {
		// TODO - implement classes.Lecturer.removeCourse
		throw new UnsupportedOperationException();
	}

	public Course[] getCourses() {
		return this.courses;
	}

}