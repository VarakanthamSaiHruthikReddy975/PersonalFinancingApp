package com.personal.financemanager.finance_tracker.mapper;

import com.personal.financemanager.finance_tracker.dto.BudgetDTO;
import com.personal.financemanager.finance_tracker.model.Budget;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface BudgetMapper {
    BudgetDTO toDto(Budget budget);
    Budget toEntity(BudgetDTO budgetDTO);

    @Mapping(target = "id", ignore = true)
    void updateEntityFromDtoBudget(BudgetDTO budgetDTO, @MappingTarget Budget budget);
}
