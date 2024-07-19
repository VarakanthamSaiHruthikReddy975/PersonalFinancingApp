package com.personal.financemanager.finance_tracker.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String category;
    private BigDecimal amount;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;
}
