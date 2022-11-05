package business;

import java.util.List;

import entity.Course;

public interface ICourse {

	void add(Course course) throws Exception;

	void delete(int id) throws Exception;

	List<Course> getAll();
}
