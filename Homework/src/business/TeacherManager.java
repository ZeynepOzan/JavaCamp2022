package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.TeacherDao;
import entity.Teacher;

public class TeacherManager implements ITeacher {

	private TeacherDao teacherDao;
	private Logger[] loggers;

	public TeacherManager(TeacherDao teacherDao, Logger[] loggers) {
		this.teacherDao = teacherDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Teacher teacher) throws Exception {
		for (Teacher teacher2 : teacherDao.getAll()) {
			if (teacher2.getName().equals(teacher.getName())) {
				throw new Exception("Aynı isimde öğretmen bulunamaz");
			}
		}
		teacherDao.add(teacher);
		for (Logger logger : loggers) {
			logger.log(teacher.getName());
		}
	}

	@Override
	public void delete(int id) throws Exception {
		
		teacherDao.delete(id);
	}

	@Override
	public List<Teacher> getAll() {
		System.out.println("Öğretmen Listesi");
		for (Teacher teacher1 : teacherDao.getAll()) {
			System.out.println(teacher1.getName());
		}
		return null;
	}
}
