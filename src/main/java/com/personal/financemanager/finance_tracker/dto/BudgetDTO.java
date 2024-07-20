package com.personal.financemanager.finance_tracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BudgetDTO {
    private Long id;
    private String category;
    private BigDecimal amount;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
