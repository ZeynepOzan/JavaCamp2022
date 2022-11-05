package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entity.Category;

public class CategoryManager implements ICategory {

	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {

		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Category category) throws Exception {
		for (Category category1 : categoryDao.getAll()) {
			if (category1.getName().equals(category.getName())) {
				throw new Exception("Aynı isimde kurs bulunmaktadır");
			}
		}

		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}

	@Override
	public void delete(int id) throws Exception {

		categoryDao.delete(id);
		
	}

	@Override
	public List<Category> getAll() {

		System.out.println("Kategori Listesi");
		for (Category category2 : categoryDao.getAll()) {
			System.out.println(category2.getName());
		}

		return null;
	}
}
