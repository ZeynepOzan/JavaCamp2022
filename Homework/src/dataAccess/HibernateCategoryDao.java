package dataAccess;

import java.util.List;

import entity.Category;
import main.DataBase;

public class HibernateCategoryDao implements CategoryDao {

	List<Category> categories = DataBase.categories;

	@Override
	public void add(Category category) {
		categories.add(category);
		System.out.println(category.getName() + " " + this.getClass().getSimpleName() + " ile eklendi");
	}

	@Override
	public void delete(int id) {

		
		Category category1 = this.categories.stream().filter(c -> c.getId() == id).findFirst().get();
		categories.remove(category1);
		System.out.println(id + " " + this.getClass().getSimpleName() + " ile silindi");

	}

	@Override
	public List<Category> getAll() {

		return categories;
	}
}
