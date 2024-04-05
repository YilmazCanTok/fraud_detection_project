package com.example.transactioncontrolsystem.service;

import com.example.transactioncontrolsystem.entity.Transaction;
import com.example.transactioncontrolsystem.exception.NotFoundException;
import com.example.transactioncontrolsystem.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import weka.classifiers.trees.RandomForest;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;
    @Override
    public Transaction getTransaction(Integer id) {
        Optional<Transaction> byId = transactionRepository.findById(id);
        return byId.orElseThrow(() -> new NotFoundException("Transaction"));
    }

    @Override
    public void addTransaction(Transaction transaction) {
        transactionRepository.save(transaction);
    }

    @Override
    public Transaction updateTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public boolean deleteTransaction(Integer id) {
        transactionRepository.delete(getTransaction(id));
        return true;
    }

    public boolean checkTransactionStatus(Integer id){
        Optional<Transaction> byId = transactionRepository.findById(id);

    }
}