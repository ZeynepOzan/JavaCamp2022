package dataAccess;

import java.util.List;

import entity.Category;

public interface CategoryDao {
	public void add(Category category);

	public void delete(int id);

	List<Category> getAll();
}
