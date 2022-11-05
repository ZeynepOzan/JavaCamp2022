package business;

import java.util.List;

import entity.Category;

public interface ICategory {

	void add(Category category) throws Exception;

	void delete(int id) throws Exception;
	
	List<Category> getAll();
}
