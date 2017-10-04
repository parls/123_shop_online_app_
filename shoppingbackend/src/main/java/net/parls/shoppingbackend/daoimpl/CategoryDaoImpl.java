package net.parls.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import net.parls.shoppingbackend.dao.CategoryDao;
import net.parls.shoppingbackend.dto.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	private static List<Category> categories = new ArrayList<>();
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Category item 1");
		category.setDescription("Item description 1");
		category.setImageUrl("category_item_1.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Category item 2");
		category.setDescription("Item description 2");
		category.setImageUrl("category_item_2.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Category item 3");
		category.setDescription("Item description 3");
		category.setImageUrl("category_item_3.png");
		
		categories.add(category);
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
