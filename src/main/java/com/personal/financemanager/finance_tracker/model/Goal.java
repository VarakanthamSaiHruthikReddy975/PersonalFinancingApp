package com.personal.financemanager.finance_tracker.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String name;
    private BigDecimal targetAmount;

    private BigDecimal savedAmount;
    private LocalDate targetDate;
    private String status;

}
