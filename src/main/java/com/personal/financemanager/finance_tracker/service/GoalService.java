package com.personal.financemanager.finance_tracker.service;

import com.personal.financemanager.finance_tracker.dto.GoalDTO;

import java.util.List;
import java.util.Optional;

public interface GoalService {

    GoalDTO createGoal(Long userId, GoalDTO goalDTO);
    GoalDTO updateGoal(Long goalId, GoalDTO goalDTO);
    void deleteGoal(Long goalId);
    Optional<GoalDTO> getGoalById(Long goalId);
    List<GoalDTO> getGoalsByUserId(Long userId);
    List<GoalDTO> getGoalsByUserIdAndStatus(Long userId, String status);
}
