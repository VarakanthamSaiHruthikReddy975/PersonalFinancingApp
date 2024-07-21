package com.personal.financemanager.finance_tracker.serviceImpl;

import com.personal.financemanager.finance_tracker.dto.BudgetDTO;
import com.personal.financemanager.finance_tracker.service.BudgetService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BudgetServiceImpl implements BudgetService {
    @Override
    public BudgetDTO createBudget(Long userId, BudgetDTO budgetDTO) {
        return null;
    }

    @Override
    public BudgetDTO updateBudget(Long budgetId, BudgetDTO budgetDTO) {
        return null;
    }

    @Override
    public void deleteBudget(Long budgetId) {

    }

    @Override
    public Optional<BudgetDTO> getBudgetById(Long budgetId) {
        return Optional.empty();
    }

    @Override
    public List<BudgetDTO> getBudgetsByUserId(Long userId) {
        return null;
    }

    @Override
    public List<BudgetDTO> getBudgetsByUserIdAndCategory(Long userId, String category) {
        return null;
    }
}
