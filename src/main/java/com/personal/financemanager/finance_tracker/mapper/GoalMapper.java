package com.personal.financemanager.finance_tracker.mapper;

import com.personal.financemanager.finance_tracker.dto.GoalDTO;
import com.personal.financemanager.finance_tracker.model.Goal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface GoalMapper {

    GoalDTO toDto(Goal goal);
    Goal toEntity(GoalDTO goalDTO);

    @Mapping(target = "id")
    void updateEntityFromDtoGoal(GoalDTO goalDTO, @MappingTarget Goal goal);
}
