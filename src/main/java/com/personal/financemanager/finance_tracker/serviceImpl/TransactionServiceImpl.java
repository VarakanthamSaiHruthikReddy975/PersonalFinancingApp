package com.personal.financemanager.finance_tracker.serviceImpl;

import com.personal.financemanager.finance_tracker.dto.TransactionDTO;
import com.personal.financemanager.finance_tracker.service.TransactionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TransactionServiceImpl implements TransactionService {
    @Override
    public TransactionDTO createTransaction(Long userId, TransactionDTO transactionDTO) {
        return null;
    }

    @Override
    public TransactionDTO updateTransaction(Long transactionId, TransactionDTO transactionDTO) {
        return null;
    }

    @Override
    public void deleteTransaction(Long transactionId) {

    }

    @Override
    public Optional<TransactionDTO> getTransactionById(Long transactionId) {
        return Optional.empty();
    }

    @Override
    public List<TransactionDTO> getTransactionsByUserId(Long userId) {
        return null;
    }

    @Override
    public List<TransactionDTO> getTransactionsByUserIdAndType(Long userId, String type) {
        return null;
    }

    @Override
    public List<TransactionDTO> getTransactionsByUserIdAndCategory(Long userId, String category) {
        return null;
    }
}
