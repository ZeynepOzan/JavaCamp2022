package dataAccess;

import java.util.List;

import entity.Course;
import main.DataBase;

public class JdbcCoursesDao implements CourseDao {

	List<Course> courses = DataBase.courses;

	@Override
	public void add(Course course) {
		courses.add(course);
		System.out.println(course.getName() + " " + this.getClass().getSimpleName() + " ile eklendi");
	}

	@Override
	public void delete(int id) {

		Course course1 = this.courses.stream().filter(c -> c.getId() == id).findFirst().get();
		courses.remove(course1);
		System.out.println(id + " " + this.getClass().getSimpleName() + " ile silindi");

	}

	@Override
	public List<Course> getAll() {

		return courses;
	}

}
