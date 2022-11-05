package business;

import java.util.List;

import entity.Teacher;

public interface ITeacher {
	void add(Teacher teacher) throws Exception;

	void delete(int id) throws Exception;

	List<Teacher> getAll();

}
