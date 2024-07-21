package com.personal.financemanager.finance_tracker.mapper;

import com.personal.financemanager.finance_tracker.dto.CategoryDTO;
import com.personal.financemanager.finance_tracker.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDTO toDto(Category category);
    Category toEntity(CategoryDTO categoryDTO);

    void udpateEntityFromDtoCategory(CategoryDTO categoryDTO, @MappingTarget Category category);
}
