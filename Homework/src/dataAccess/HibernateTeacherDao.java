package dataAccess;

import java.util.List;

import entity.Teacher;
import main.DataBase;

public class HibernateTeacherDao implements TeacherDao {

	List<Teacher> teachers = DataBase.teachers;

	@Override
	public void add(Teacher teacher) {
		teachers.add(teacher);
		System.out.println(teacher.getName() + " " + this.getClass().getSimpleName() + " ile eklendi");

	}

	@Override
	public void delete(int id) {
		Teacher teacher1 = this.teachers.stream().filter(c -> c.getId() == id).findFirst().get();
		teachers.remove(teacher1);
		System.out.println(id + " " + this.getClass().getSimpleName() + " ile silindi");
	}

	@Override
	public List<Teacher> getAll() {

		return teachers;
	}

}
