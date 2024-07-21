package com.personal.financemanager.finance_tracker.service;

import com.personal.financemanager.finance_tracker.dto.TransactionDTO;

import java.util.List;
import java.util.Optional;

public interface TransactionService {
    TransactionDTO createTransaction(Long userId, TransactionDTO transactionDTO);
    TransactionDTO updateTransaction(Long transactionId, TransactionDTO transactionDTO);
    void deleteTransaction(Long transactionId);
    Optional<TransactionDTO> getTransactionById(Long transactionId);
    List<TransactionDTO> getTransactionsByUserId(Long userId);
    List<TransactionDTO> getTransactionsByUserIdAndType(Long userId, String type);
    List<TransactionDTO> getTransactionsByUserIdAndCategory(Long userId, String category);}
