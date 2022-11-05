package main;

import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.TeacherManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MaillLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.HibernateTeacherDao;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcCoursesDao;
import dataAccess.JdbsTeacherDao;
import entity.Category;
import entity.Course;
import entity.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Category category1 = new Category(123, "Java");
		Category category2 = new Category(2, "JavaSpring");
		Category category3 = new Category(6, "Java3");
		
		Logger [] loggers = {new DatabaseLogger(),new MaillLogger()};
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
		categoryManager.add(category1);
		categoryManager.add(category2);
		categoryManager.add(category3);
		categoryManager.getAll();
		categoryManager.delete(123);
		categoryManager.getAll();
		
		
		Course course1 = new Course(3, "Zeynep", category1,200);
		Course course2 = new Course(5, "Zeyne", category1, 100);
	
		CourseManager courseManager = new CourseManager(new JdbcCoursesDao(),loggers);
		courseManager.add(course2);
		courseManager.add(course1);
		courseManager.getAll();
		
		System.out.println("******************");
		System.out.println();
		
		Teacher teacher1 = new Teacher(7, "Ahmet Ali");
		Teacher teacher2 = new Teacher(6,"Aht");
		
		TeacherManager teacherManager = new TeacherManager(new JdbsTeacherDao(),loggers);
		teacherManager.add(teacher1);
		teacherManager.add(teacher2);
		teacherManager.getAll();
		teacherManager.delete(6);
		
		
		
	}
}
