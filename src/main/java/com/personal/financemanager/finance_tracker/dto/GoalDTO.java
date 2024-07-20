package com.personal.financemanager.finance_tracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoalDTO {
    private Long id;
    private String name;
    private BigDecimal targetAmount;
    private BigDecimal savedAmount;
    private LocalDateTime targetDate;
    private String status;
}
