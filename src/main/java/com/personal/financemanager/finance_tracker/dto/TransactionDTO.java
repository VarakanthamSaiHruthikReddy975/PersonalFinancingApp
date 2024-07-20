package com.personal.financemanager.finance_tracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO {
    private Long id;
    private String type; // "income" or "expense"
    private BigDecimal amount;
    private LocalDateTime date;
    private String category;
    private String description;
}
