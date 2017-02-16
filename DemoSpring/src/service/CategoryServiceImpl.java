package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.CategoryDAO;
import dto.Category;

public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryDAO categoryDAO ;
	
	@Override
	public List<Category> getAll() {
		return categoryDAO.getAll();
	}
	
}
