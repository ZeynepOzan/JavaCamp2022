package dataAccess;

import java.util.List;

import entity.Teacher;

public interface TeacherDao {
	void add(Teacher teacher);

	void delete(int id);

	List<Teacher> getAll();

}
