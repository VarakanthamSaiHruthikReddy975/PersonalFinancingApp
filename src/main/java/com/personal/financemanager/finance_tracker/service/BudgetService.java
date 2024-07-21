package com.personal.financemanager.finance_tracker.service;

import com.personal.financemanager.finance_tracker.dto.BudgetDTO;

import java.util.List;
import java.util.Optional;

public interface BudgetService {

    BudgetDTO createBudget(Long userId, BudgetDTO budgetDTO);
    BudgetDTO updateBudget(Long budgetId, BudgetDTO budgetDTO);
    void deleteBudget(Long budgetId);
    Optional<BudgetDTO> getBudgetById(Long budgetId);
    List<BudgetDTO> getBudgetsByUserId(Long userId);
    List<BudgetDTO> getBudgetsByUserIdAndCategory(Long userId, String category);
}

