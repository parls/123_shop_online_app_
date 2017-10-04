package net.parls.shoppingbackend.dao;

import java.util.List;
import net.parls.shoppingbackend.dto.Category;

public interface CategoryDao
{
	List<Category> list();
}
