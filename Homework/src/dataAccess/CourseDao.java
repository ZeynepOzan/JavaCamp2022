package dataAccess;

import java.util.List;

import entity.Course;

public interface CourseDao {
	public void add(Course course);

	public void delete(int id);

	List<Course> getAll();

}
