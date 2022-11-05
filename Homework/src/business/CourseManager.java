package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.CourseDao;
import entity.Course;

public class CourseManager implements ICourse {

	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Course course) throws Exception {
		for (Course course1 : courseDao.getAll()) {
			if (course1.getName().equals(course.getName())) {
				throw new Exception("Aynı isimde kurs bulunmaktadır");
			}
			if (course.getPrice() < 0) {
				throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
			}
		}
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

	@Override
	public void delete(int id) throws Exception {

		courseDao.delete(id);
	}

	@Override
	public List<Course> getAll() {
		System.out.println("Kurs Listesi");
		for (Course course1 : courseDao.getAll()) {
			System.out.println(course1.getName());
		}

		return null;
	}

}
