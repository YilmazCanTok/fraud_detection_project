package com.example.transactioncontrolsystem.service;

import com.example.transactioncontrolsystem.entity.Transaction;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

public interface TransactionService {

    Transaction getTransaction(Integer id);
    void addTransaction(@RequestBody Transaction transaction);
    Transaction updateTransaction(@RequestBody Transaction transaction);
    boolean deleteTransaction(Integer id);


}