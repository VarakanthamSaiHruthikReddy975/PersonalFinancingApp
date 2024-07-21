package com.personal.financemanager.finance_tracker.service;

import com.personal.financemanager.finance_tracker.dto.CategoryDTO;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO updateCategory(Long categoryId, CategoryDTO categoryDTO);
    void deleteCategory(Long categoryId);
    Optional<CategoryDTO> getCategoryById(Long categoryId);
    List<CategoryDTO> getAllCategories();
    List<CategoryDTO> getCategoriesByType(String type);
}
