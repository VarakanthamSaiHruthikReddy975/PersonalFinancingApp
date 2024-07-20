package com.personal.financemanager.finance_tracker.repository;


import com.personal.financemanager.finance_tracker.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
