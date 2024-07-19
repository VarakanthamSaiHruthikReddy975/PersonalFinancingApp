package com.personal.financemanager.finance_tracker.model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


    private String type; //It can be either of type income or expense

    private BigDecimal amount;
    private LocalDateTime localDateTime;
    private String category;
    private String description;

}
