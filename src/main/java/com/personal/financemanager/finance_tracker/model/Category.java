package com.personal.financemanager.finance_tracker.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Category {

    @Id
    private Long id;

    private String name;

    private String type;

    @OneToMany(mappedBy = "category")
    private Set<Transaction> transactions;

    @OneToMany(mappedBy = "category")
    private Set<Budget> budgets;
}
