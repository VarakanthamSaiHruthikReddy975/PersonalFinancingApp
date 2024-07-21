package com.personal.financemanager.finance_tracker.mapper;

import com.personal.financemanager.finance_tracker.dto.TransactionDTO;
import com.personal.financemanager.finance_tracker.model.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    TransactionDTO toDto(Transaction transaction);
    Transaction toEntity(TransactionDTO transactionDTO);

    @Mapping(target = "id", ignore = true)
    void updateEntityFromDtoTransaction(TransactionDTO transactionDTO, @MappingTarget Transaction transaction);
}

