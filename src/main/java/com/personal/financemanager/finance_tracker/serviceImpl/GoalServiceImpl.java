package com.personal.financemanager.finance_tracker.serviceImpl;

import com.personal.financemanager.finance_tracker.dto.GoalDTO;
import com.personal.financemanager.finance_tracker.service.GoalService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class GoalServiceImpl implements GoalService {
    @Override
    public GoalDTO createGoal(Long userId, GoalDTO goalDTO) {
        return null;
    }

    @Override
    public GoalDTO updateGoal(Long goalId, GoalDTO goalDTO) {
        return null;
    }

    @Override
    public void deleteGoal(Long goalId) {

    }

    @Override
    public Optional<GoalDTO> getGoalById(Long goalId) {
        return Optional.empty();
    }

    @Override
    public List<GoalDTO> getGoalsByUserId(Long userId) {
        return null;
    }

    @Override
    public List<GoalDTO> getGoalsByUserIdAndStatus(Long userId, String status) {
        return null;
    }
}
